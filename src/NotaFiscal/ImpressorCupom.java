package NotaFiscal;

public class ImpressorCupom {
    public void imprimir(Cupom cupom) {
        /**
         Vamos somente imprimir o resultado no console
         mas este mesmo conteudo podera proporcionar varias saidas
         logo a variavel conteudo deveria ser retornada para outros "processadores"
         Como gerador de arquivo txt, pdf ou ate mesmo o envio por email
         */

        /*
        CONSIDERE O COMPRIMENTO MAXIMO DE 50 CARACTERES EM CADA LINHA
        E APLIQUE O RESPECTIVO ALINHAMENTO
         */
        StringBuilder conteudo = new StringBuilder();
        conteudo.append(String.format("%-50s\n", cupom.nomeFantasia));
        conteudo.append(tracos());
        //  conteudo.append(cupom.nomeFantasia + "\n");
        Endereco end = cupom.endereco;
        conteudo.append(String.format("%sN. %s %sCPF/CNPJ:%s %s\n",
                end.logradoro, end.numero, end.complemento, this.formatCpfCnpj(cupom.cpf), cupom.data));

        conteudo.append(String.format("IE:%s %s\nIM:%s CFF%s\nCDD:%s\n",
                cupom.ie, cupom.hora, cupom.im, cupom.ccf, cupom.cdd));
        //terminado a concatenacao de forma reduzida ultilizando String.format

        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        //esperado que facam

        conteudo.append(String.format("ITEM COD. %-30s%10s\n", "DESCRIÇÂO", "VALOR"));
        //conteudo.append(String.format("%d ));

        CupomItem item01;
        for (CupomItem item : cupom.itens) {
            conteudo.append(String.format("%-4.4s %-4.4s %-15.15s %-2.2s R$ %s R$ %9s\n",
                    item.ordem, item.sku, item.descricao, item.und, item.preco, item.subtotal));
        }
        conteudo.append(tracos());
        System.out.println(conteudo);
        //em caso de resolver explorar algumas formas de apresentacao
        //return conteudo.toString();

    }

    private String tracos() {
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }

    protected String formatCpfCnpj(String cpfCnpj) {
        int size = cpfCnpj.length();
        if (!(size == 11 || size == 14)) {
            throw new IllegalArgumentException("cpf ou cnpj invalido");
        }
        String newCnpj = " ";
        if (cpfCnpj.length() == 11)
            newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        else
            newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return newCnpj;
    }


}

class TesteimpressorCupo {
    public static void main(String[] args) {
        String cpf = "1234567890";
        String cpfExpected = "123.456.789-01";
        String cnpj = "12345678901234";
        String cnpjExpected = "12.345.678/9012-34";
        ImpressorCupom impressorCupom = new ImpressorCupom();
        System.out.println("Formatação ok?8UEJ9QJHD9Q " + impressorCupom.formatCpfCnpj(cpf));


    }
}