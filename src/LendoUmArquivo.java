/*
 Crie um programa que leia o conteúdo do arquivo mensagem.txt (do exercício anterior) e exiba na tela.
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class LendoUmArquivo {
    public static void main(String[] args) {
        final String lerArquivo = "mensagem.txt";
        String lendoLinha;
        try{
        FileReader fileReader = new FileReader(lerArquivo);
        BufferedReader arq = new BufferedReader(fileReader);
        
        while((lendoLinha = arq.readLine())!= null){
            System.out.println("Conteudo" + lendoLinha);
        } arq.close();
        } catch(Exception e){
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
