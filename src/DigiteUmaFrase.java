/*
 Crie um programa que receba uma frase do usuário e salve essa frase em um arquivo chamado mensagem.txt.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class DigiteUmaFrase {
    public static void main(String[] args) {       
    Scanner entrada = new Scanner(System.in); //abrindo Scanner para entrada de dados

    System.out.println("Digite uma frase: "); //pedindo ao usuário para digitar uma frase
    String frase = entrada.nextLine(); //lendo a frase digitada pelo usuário

    try{ //tentando salvar a frase em um arquivo
    FileWriter fileWriter = new FileWriter("mensagem.txt"); //criando um FileWriter para o arquivo mensagem.txt
    BufferedWriter writer = new BufferedWriter(fileWriter); //criando um BufferedWriter para escrever no arquivo
    
    writer.write(frase); //escrevendo a frase no arquivo
    writer.newLine(); //adicionando uma nova linha após a frase

    writer.close(); //fechando o BufferedWriter para garantir que os dados sejam salvos corretamente
    System.out.println("Frase salva com sucesso."); //informando ao usuário que a frase foi salva com sucesso
    } catch(Exception e){ //tratando possíveis exceções ao tentar salvar a frase
        System.out.println("Ocorreu um erro ao salvar a frase: " + e.getMessage()); //exibindo mensagem de erro caso ocorra algum problema
    } 
    entrada.close();//fechando o Scanner para evitar vazamento de recursos

}
}