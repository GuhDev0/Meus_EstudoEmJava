import java.awt.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        LinkedList fila = new LinkedList<>();

        fila.addLast("Gustavo");
        fila.addLast("Lucas");
        fila.addLast("Miguel");
        fila.addLast("Otavio");
        fila.addLast("Guilherme");

        System.out.println(fila);

        while (!fila.isEmpty()){
            System.out.println("Fila atual: " + fila);
            String proximo = (String) fila.peekFirst();
            System.out.println("Atendimento " + proximo);
           String test = (String) fila.removeFirst();
            System.out.println("Fila atual: " + fila);
            System.out.println("------");
        }
        System.out.println("Fila Vazia");
    }
}