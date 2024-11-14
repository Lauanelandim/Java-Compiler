// Repetição sobre arrays/ coleções.
//Exercicio percorrendo array de inteiros.

public class ExemploForEach {
    public static void main(String[] args){
        int [] numeros = {1, 2, 3, 4, 5}; // Vetor inteiro "numeros".
        for (int numero : numeros) {
        /* Lado esquerdo : Lado direito
        Lado esquerdo: Declara variável para armazenamento temporário o valor do 
        elemento durante a repetição.
        Lado direito: É o array/coleção que estamos percorrendo*/
            System.out.println(numero);
            
        } 
    }
}
