// Executa pelo menos uma vez, verificação após executar.

public class ExemploWhile2 {
    public static void main(String[] args){
        int cont = 1;
        do { 
            System.out.println("Contadora:" + cont);
            cont++;
        } while(cont <6);
    }
}