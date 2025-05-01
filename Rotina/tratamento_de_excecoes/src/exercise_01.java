
public class exercise_01 {


    public  static void dividir(int n1,int n2){
        System.out.println(n1/n2);
    }

    public static void Main(String[] args) {

        try{
            dividir(10,0);
        }catch (ArithmeticException error){
            System.out.println("error: You can t divide by zero "  );
        }

    }

}
