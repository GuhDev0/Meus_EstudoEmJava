public class Lutador {
    private String nome;
    private  String nacionalidae;
    private  int idade;
    private  double altura;
    private  double peso;
    private   String categoria;
    private  int vitorias;
    private  int derrotas;
    private  int empates;

    public  Lutador(String no,String na,int id,double al,double pe,String cate,int vi,int de,int em){
        nome = no;
        nacionalidae = na;
        idade = id;
        altura = al;
        peso = pe;
        categoria = cate;
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public void apresentar(){

    }
    public void status(){

    }
    public  void ganhaLuta(){

    }
    public void perdeLuta(){

    }
    public  void empatarLuta(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if(getPeso() < 52.2){
            categoria = "invalido";
        } else if (peso <= 70.3) {
            categoria = "leve";
        } else if (peso <= 83.9) {
            categoria = "media";
        } else if (peso <= 120.2) {
            categoria = "pesado";
        }else {
            categoria = "invalido";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidae() {
        return nacionalidae;
    }

    public void setNacionalidae(String nacionalidae) {
        this.nacionalidae = nacionalidae;
    }
}
