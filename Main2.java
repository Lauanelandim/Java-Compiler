//Subclasse Jetta
class Carro {
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}

//Subclasse Fusca
class Fusca extends Carro {
    @Override
     public void acelerar() {      
         System.out.println("O fusca acelera lentamente: Vruum!");
        }
}

//Subclasse Gol
class Gol extends Carro {
    @Override 
    public void acelerar() {
        System.out.println("O Gol acelera com potência: Vruuuum!");
    }
}

//Subclasse Jetta
class Jetta extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Jetta acelera rapidamente: Vruuuuuum!");
    }
}

//Classe Principal para testar o polimorfismo
public class Main2 {
    public static void main(String[] args) {
        //Criando um array do Carros
        Carro[] carros = new Carro[3];
        carros[0] = new Fusca();
        carros[1] = new Gol();
        carros[2] = new Jetta();

        //Chamando o método acelerar() para cada carro
        for (Carro carro : carros) {
            carro.acelerar(); //POlimorfismo em ação
        }

    }
}