class Animal {
    void fazerSom(){
        System.out.println("O animal faz um som");
    }
    
}

class Cachorro extends Animal{
    @Override
    void fazerSom(){
        super.fazerSom(); //Chamando o método da superclasse
        System.out.println("O cachorro late");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
        }
        
   
}
