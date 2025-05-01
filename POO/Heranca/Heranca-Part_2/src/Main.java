//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Visitante v1 = new Visitante("lucas",22,"M");
            System.out.println("Visitante "+ v1.toString());
            Aluno a1 = new Aluno("Gustavo",25,"M");
            a1.setMatricula(252525);
            System.out.println("Aluno " + a1.toString());
            a1.PagarMensalidade();

    }
}