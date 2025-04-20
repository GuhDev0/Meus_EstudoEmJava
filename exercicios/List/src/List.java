import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        java.util.List
                <String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("maça");
        frutas.add("morango");
        frutas.add("uva");
        System.out.println(frutas);
         frutas.remove("morango");
        System.out.println(frutas);
        frutas.remove(0);
        System.out.println(frutas);
    }
}