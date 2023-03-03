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

        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado. " + e.getMessage());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ops! Ocorreu um erro não inesperado." + e.getMessage());

        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            //throw lança nova exception
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}
class ImpossivelAberturaDeArquivoException extends Exception{

    private String nomeDoArquivo;
    private String caminho;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String caminho) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + caminho);
        this.nomeDoArquivo = nomeDoArquivo;
        this.caminho = caminho;
    }
    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException { nomeDoArquivo=" + nomeDoArquivo + "; diretório=" + caminho + " }";  
    }
}
