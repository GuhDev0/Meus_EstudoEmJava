import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("----Welcome to the Bank ----");
            System.out.println("1 - Register new User ");
            System.out.println("2 - Exit");
             opcao = user.nextInt();
             user.nextLine();

            switch (opcao){
                case 1:
                    register(user);
                    case 2:
                    System.out.println("exiting the program");
            }

            if(opcao < 0 || opcao > 2){
                System.out.println("Enter a valid value ");
            }
        }while ( opcao != 2 );

    }


    public  static void register(Scanner userRegister){
        System.out.println("---welcome to the Register the User--- \n");
        System.out.println("Enter your name: ");
        String name = userRegister.nextLine();
        System.out.println("Enter  your account number: ");
        String numberAccount = userRegister.nextLine();
        UserBanking userBanking = null;

        try{
            int numberAccountConverted = Integer.parseInt(numberAccount);
            userBanking = new UserBanking(name,numberAccountConverted,0);
            System.out.println("balance : 0");
        }catch (NumberFormatException error){
            System.out.println("Error: " + "Enter a Number please!");
        }

        if(userBanking != null){
            System.out.println("Creade with Success");
        }
    }
}
