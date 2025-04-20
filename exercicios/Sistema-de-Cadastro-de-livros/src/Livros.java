public class Livros {

    String titulo;
    String nomeDoAutor;
    int anoPublicacao;

    public  Livros(String titulo, String nomeDoAutor,int anoPublicacao){
        this.titulo = titulo;
        this.nomeDoAutor = nomeDoAutor;
        this.anoPublicacao = anoPublicacao;
    }

    public void statusLivro() {
        System.out.println(getTitulo());
        System.out.println(getNomeDoAutor());
        System.out.println(getAnoPublicacao());
    }
    @Override
    public  String toString(){
        return "Livro: " + titulo + ", autor: " + nomeDoAutor + ", ano: " + anoPublicacao;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
