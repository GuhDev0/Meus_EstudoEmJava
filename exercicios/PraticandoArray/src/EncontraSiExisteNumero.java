import java.util.Arrays;
import  java.util.stream.Stream;

public class EncontraSiExisteNumero {
    public static void main(String[] args) {
        int[] arrayNumber = {5,10,20,15,2};

           boolean existeMaiorQue10 =  Arrays.stream(arrayNumber).anyMatch(n -> n > 10);

           if(existeMaiorQue10){
               int[] novoNumero = Arrays.stream(arrayNumber).filter(n -> n > 10 ).map(n -> n * 5).toArray();
               Arrays.stream(novoNumero).forEach(System.out::println);
           }
    }
}
