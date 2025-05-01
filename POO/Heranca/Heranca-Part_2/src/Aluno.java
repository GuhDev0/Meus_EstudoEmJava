public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public Aluno(String nome,int idade,String sexo){
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
    }

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome = " + nome + '\'' +
                "matricula = " + matricula + '\'' +
                ", curso = '" + curso + '\'' +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
