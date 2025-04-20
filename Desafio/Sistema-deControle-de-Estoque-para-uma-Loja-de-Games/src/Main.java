 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        RegisterGame game = new RegisterGame();
        int opcao;
    do {
        System.out.println("---Menu----");
        System.out.println("1 - Register Game");
        System.out.println("2 - list Gamer");
        System.out.println("3 - Exit Of list");
        opcao = user.nextInt();
        switch (opcao){

        }
        String user_gamer = user.nextLine();
        String user_platform = user.nextLine();
        String user_developer = user.nextLine();
    }while();



        game.registerGame(user_gamer,user_platform,user_developer);
        System.out.println(game.getListGamers()) ;

    }


}