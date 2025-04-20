import java.util.ArrayList;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    ArrayList<Livros> livreiro = new ArrayList(4);
    Scanner usuario = new Scanner(System.in);



    System.out.println("Digite o nome do livro: ");
    String nomeLivro = usuario.nextLine();

    System.out.println("Digite o nome do autor: ");
    String nomeDoAutor = usuario.nextLine();

    System.out.println("Digite o Ano do livro: ");
    int anoDoLivro = usuario.nextInt();

    Livros livro = new Livros(nomeLivro,nomeDoAutor,anoDoLivro);
    livreiro.add(livro);

    for(int i = 0; i < livreiro.size(); i++){
        System.out.println(livreiro.get(i));
        }

    }
}