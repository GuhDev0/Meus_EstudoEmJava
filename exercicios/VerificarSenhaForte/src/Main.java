//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
         String texto = "Jav25";
        for(int i=0;i<texto.length();i++){
            char c = texto.charAt(i);
            System.out.println(c);
            if(Character.isLowerCase(c)){
                System.out.println("essa letra é miniscula");
            }else if(Character.isUpperCase(c)){
                System.out.println("Essa letra é maiscula");
            } else if (Character.isDigit(c)) {
                System.out.println("é Um Numero");
            }
        }
    }
}