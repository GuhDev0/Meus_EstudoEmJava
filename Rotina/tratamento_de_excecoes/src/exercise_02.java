import java.util.Scanner;

public class exercise_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String user = sc.nextLine();

        try{
            int number = Integer.parseInt(user);
            System.out.println("Successfully converted");
        }catch (NumberFormatException error){
            System.out.println("error: " + error.toString());
        }
    }
}
