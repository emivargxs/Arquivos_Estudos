/*
Contar linhas de um arquivo
Dado um arquivo chamado texto.txt, crie um programa que conte quantas linhas existem no arquivo.
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class ContarLinhasDeUmArquivo {
    public static void main(String[] args) {
    
    final String arquivoDados = "mensagem.txt";
    
    try{
        FileReader fileReader = new FileReader(arquivoDados);
        BufferedReader arq = new BufferedReader(fileReader);
        
        int contadorLinhas = 0; //inicializando contador de linhas  
        String lendoLinha; //variável para armazenar cada linha lida do arquivo
        while((lendoLinha = arq.readLine()) != null) { //lendo o arquivo linha por linha
            contadorLinhas++; //incrementando o contador para cada linha lida
        } System.out.println("Total de linhas no arquivo: " + contadorLinhas); //exibindo o total de linhas lidas

        arq.close();
    }catch(Exception e) { //tratando possíveis exceções ao tentar ler o arquivo
        System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage()); //exibindo mensagem de erro caso ocorra algum problema
    
    
    
    }
}
}