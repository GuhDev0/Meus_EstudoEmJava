
public class Main {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();

      p1.setNome("Pedro");
      p2.setNome("Giovani");
      p3.setNome("Maria");
      p4.setNome("Claudia");

      p1.setSexo("M");
      p2.setSexo("M");
      p3.setSexo("F");
      p4.setSexo("F");

      p1.setIdade(21);
      p2.setIdade(55);
      p3.setIdade(30);
      p4.setIdade(28);

      p2.setCurso("Informatica");
      p3.setSalario(550.20f);
      p4.setSetor("Estoque");

      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());
    }
}