package Aula01_criando_objeto;

public class main {

    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo= "Bic Cristal";
    c1.cor = "Preta";
    c1.carga = 80;
    c1.destampar();
    c1.status();
    c1.rabiscar();
    }
}
