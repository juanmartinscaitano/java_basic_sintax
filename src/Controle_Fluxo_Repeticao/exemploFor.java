package Controle_Fluxo_Repeticao;

public class exemploFor {
    public static void main(String[] args) {
        boolean dormiu = false;
        for(int carneirinhos = 1; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - carneirinho(s)");
        }

        String alunos[] = {"jhon", "pablo", "george", "kenedy"} ;

        for (String aluno : alunos ) {
            System.out.println(aluno);
        }
    }
}
