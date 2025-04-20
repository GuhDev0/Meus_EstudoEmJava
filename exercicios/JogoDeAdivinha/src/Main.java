import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Random gerador = new Random();
    Scanner scanner = new Scanner(System.in);


    int numeroSoteado = gerador.nextInt(100);
    int tentativa = 5;

     for(int i = 0 ; i < tentativa ; i++){
         System.out.println("Digite o numero ai? ");
         int value = scanner.nextInt();
         if (value == numeroSoteado){
             System.out.println("Voce Acertou");
             break;
         } else if (value > numeroSoteado) {
             System.out.println("Numero é menor");
         }else {
             System.out.println("numero é maior");
         }
         if(i == tentativa - 1){
             System.out.println("numero de tentativas acabou" );
         }

     }

        scanner.close();

    }
}