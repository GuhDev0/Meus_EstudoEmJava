//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void tabuada(int value){
        for(int i = 0 ; i <= 10; i++){
            int res = value * i;
            System.out.println(value + "x" + i +" = " + res);
        }
    }
    public static void main(String[] args) {
         tabuada(5);
         tabuada(10);

    }

}