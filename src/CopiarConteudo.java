/*
 Crie um programa que copie o conteúdo de arquivo_origem.txt para arquivo_destino.txt.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopiarConteudo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo_origem.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo_destino.txt"));

            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Conteúdo copiado com sucesso para arquivo_destino.txt");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao copiar o conteúdo: " + e.getMessage());
        }
    }
}