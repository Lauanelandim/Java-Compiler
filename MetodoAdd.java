import java.util.Collection;
import java.util.ArrayList;

public class MetodoAdd {
    public static void main(String[] args) {
        //Criação de uma coleção de Strings
        Collection<String> nomes = new ArrayList<>(); //Adicionando o tipo genérico
        nomes.add("Lauane");
        nomes.add("Lidia");
        nomes.add("Samara");
        nomes.add("Laiane");
        nomes.add("Igor");
        
        //Imprimindo a lista de nomes
        System.out.println("Lista de nomes: " + nomes);
    }
}