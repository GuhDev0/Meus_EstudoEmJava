import java.util.Arrays;
import java.util.stream.IntStream;
public class MultiplosPor3_Desafio {
    public static void main(String[] args) {
        int[] array = {3,6,10,8};

         long retornoDeMultiplos = Arrays.stream(array).filter( n -> n % 3 == 0).count();
        System.out.println(retornoDeMultiplos);
    }
}
