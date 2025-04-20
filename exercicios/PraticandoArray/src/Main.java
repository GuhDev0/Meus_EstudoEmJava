import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arrayDeInteiro = new int[10];

         arrayDeInteiro =  new int[]{10,20,5,3,2,4,6,1,7,8};
         IntStream arrayFilter = Arrays.stream(arrayDeInteiro).filter(n -> n > 5).map(n -> n * 2);
         arrayFilter.forEach(System.out::println);

    }
}