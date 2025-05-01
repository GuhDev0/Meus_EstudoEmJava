import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args) {
        int[] vetor = {10,20,30};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 0 a 2");
        int number = sc.nextInt();


        try{
            System.out.println("value at index " + number + " : " + vetor[number]);
            }
    catch(ArrayIndexOutOfBoundsException error){
            System.out.println("error" + error.getMessage());
        }finally {
            System.out.println("program Exiting");
            sc.close();
        }

    }
}
