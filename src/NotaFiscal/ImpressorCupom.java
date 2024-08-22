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
                end.logradoro, end.numero, end.complemento, cupom.cpf, cupom.data));
        conteudo.append(String.format("IE:%s %s\nIM:%s CFF%s\nCDD:%s\n",
                cupom.ie, cupom.hora, cupom.im, cupom.ccf, cupom.cdd));
        //terminado a concatenacao de forma reduzida ultilizando String.format

        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        //esperado que facam

        conteudo.append(String.format("ITEM COD. %-30s%10s\n", "DESCRIÇÂO", "VALOR"));
        //conteudo.append(String.format("%d ));

        for (CupomItem item : cupom.itens) {
            conteudo.append("DESCRICAO DE ACORDO COM CADA ITEM EXISTENTE\n");
        }
        conteudo.append(tracos());
        System.out.println(conteudo.toString());
        //em caso de resolver explorar algumas formas de apresentacao
        //return conteudo.toString();

    }
        private String tracos() {
            String repeated = new String(new char[50]).replace("\0", "-");
            return repeated + "\n";
        }
        private String cpfCnpj(String cpfCnpj) {
            String newCnpj = " ";
            if (cpfCnpj.length()==11)
                newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            else
                newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
            return newCnpj;
        }

}
