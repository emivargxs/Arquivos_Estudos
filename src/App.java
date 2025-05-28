import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {       
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String frase = entrada.nextLine();

    try{
    FileWriter fileWriter = new FileWriter("mensagem.txt");
    BufferedWriter writer = new BufferedWriter(fileWriter);
    
    writer.write(frase);
    writer.newLine();

    writer.close();
    System.out.println("Frase salva com sucesso.");
    } catch(Exception e){
        System.out.println("Ocorreu um erro ao salvar a frase: " + e.getMessage());
    } 
    entrada.close();

}
}
/*
 Crie um programa que receba uma frase do usuário e salve essa frase em um arquivo chamado mensagem.txt.
 */