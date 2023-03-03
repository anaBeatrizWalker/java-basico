package edu.anabeatriz.java.excecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

//Imprimir um arquivo no console
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "o-poder-do-habdito-anotacoes.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);

        } catch (FileNotFoundException e){ //verifica nome errado
            JOptionPane.showMessageDialog(null, "Nome do arquivo incorreto! " + e.getMessage());
        
        } catch (IOException e) { //verifica erros de carregamento, fechamento..
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!" + e.getCause());
            e.printStackTrace();

        } finally {
            System.out.println("Finally");
        }
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException { //IOException é mãe de FileNotFoundException
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName())); //FileNotFoundException
        String line = br.readLine(); //IOException

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
