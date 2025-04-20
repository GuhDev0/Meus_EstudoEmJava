import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList arrayListVip = new LinkedList<>();


        arrayListVip.addLast("Gustavo");
        arrayListVip.addLast("Lucas");
        arrayListVip.addLast("Miguel");
        arrayListVip.addFirst("Natalia");

        while(!arrayListVip.isEmpty()){
            String proximo_e_Remove = (String) arrayListVip.removeFirst();
            System.out.println("Atendimento Atual "  + proximo_e_Remove);
            String primeiro = (String) arrayListVip.peekFirst();
            if(primeiro != null){
                System.out.println("Proximo a ser atendido " + primeiro);
                System.out.println("_____________");
            }else{
                System.out.println("Fila vazia");
            }


        }

    }
}