package JavaNewIo;

import java.io.File;
import java.io.IOException;

public class Nio {
    public static void main(String[] args) {
        File diretorio = new File("c:\\rocket\\cursojava");
        System.out.println("Diretório existe? " + diretorio.exists());
        if (!diretorio.exists()) {
            diretorio.mkdirs();
            System.out.println("Foi criado o diretório");
        }
        try {

            File arquivo = new File(diretorio ,"aula-java.txt");
            System.out.println(arquivo.exists());

            arquivo.createNewFile();
            System.out.println(arquivo.exists());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
