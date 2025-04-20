//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Champion top = new Champion("fiora",100,20,30,40);
        Champion adc = new Champion("ashe",100,20,30,20);



       while(Champion.verificarVida(top,adc)){
            Champion.primeiroAtaque(adc,top);
            System.out.println(top.nome + " " + top.getVida());
            System.out.println(adc.nome + " " + adc.getVida());
        }

    }
}