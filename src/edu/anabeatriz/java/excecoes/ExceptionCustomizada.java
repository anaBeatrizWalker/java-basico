package edu.anabeatriz.java.excecoes;

import java.io.*;
import javax.swing.JOptionPane;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo a ser exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro não inesperado." + e.getMessage());
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);
        return new BufferedReader(new FileReader(nomeDoArquivo)); //FileNotFoundException
    }
}
