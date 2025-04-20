package Aula02_Get_Set_Construtor;

public class main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("BIC CRISTAL");
        c1.setPonta(0.05f);
        c1.status();

       evoluindoCodigoCaneta  c2 = new evoluindoCodigoCaneta("Bic","Azul");
       c2.status();



    }
}
