/*Exercício que verifica o nível de conhecimento de programação com base nos anos 
de experiência*/
import java.util.Scanner;

public class ExemploIfElse2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); /*Criar um objeto Scanner para ler a 
        entrada do usuário.*/
        
        System.out.println("Digite quantos anos de experiência você possui: ");/*Solicito a 
        entrada do usuário.*/
        int anosDeExperiencia = scanner.nextInt();/*Lê o nº de anos de experiência.*/
        
        if(anosDeExperiencia <2) {
            System.out.println("Você é um desenvolvedor júnior!");
        } else if (anosDeExperiencia >= 2 && anosDeExperiencia <5){
            System.out.println("Você é um desenvolvedor pleno!");
        } else {
            System.out.println("Você é um desenvolvedor sênior!");
        }
        scanner.close(); //Fecha o scanner
    }
}
