package edu.anabeatriz.java.excecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStreamWriter;

//Imprimir um arquivo no console
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "o-poder-do-habito-anotacoes.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Mesmo sem exception, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName())); //FileNotFoundException 
        String line = br.readLine(); //IOException

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line); //IOException
            bw.newLine(); //IOException
            line=br.readLine(); //IOException
        } while (line != null);
        bw.flush(); //IOException
        br.close(); //IOException
    }

    /*
    Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Unhandled exception type FileNotFoundException
        Unhandled exception type IOException
        Unhandled exception type IOException
        Unhandled exception type IOException
        Unhandled exception type IOException
        Unhandled exception type IOException
        Unhandled exception type IOException

        at edu.anabeatriz.java.excecoes.CheckedException.imprimirArquivoNoConsole(CheckedException.java:20)
        at edu.anabeatriz.java.excecoes.CheckedException.main(CheckedException.java:13) 
    */
}
