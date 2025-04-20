import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];

        System.out.println("Digite Seu Nome: ");
        String nomeDoUsuario = scanner.nextLine();
        double somar = 0;
        double nota;
        for (int i = 0; i < notas.length;i++){
            do {
                System.out.println("Digite Sua nota: ");
                nota = scanner.nextDouble();
                if(nota < 0){
                    System.out.println("Numero Invalido ");
                } else if (nota > 10) {
                    System.out.println("Digite um Numero de 0 ate 10 \n");
                }
                notas[i] = nota ;
            } while (nota < 0 || nota > 10);
            somar += notas[i];
        }
        double media = somar / notas.length;
        String mediaFormatada = String.format("%.2f%n", media);
        System.out.printf("Aluno  " + nomeDoUsuario + "\n");
        System.out.printf("Media: " + mediaFormatada);
        if(somar > 7){
            System.out.println("ALUNO APROVADO");
        }else {
            System.out.println("ALUNO REPROVADO");
        }

    }
}