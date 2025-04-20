package Aula02_Get_Set_Construtor;

public class Caneta {
    public String modelo;
    private float ponta;
    protected boolean tampada;
    public String cor;
    public  Caneta(){ //ESSE COM O MESMO NOME DA CLASS É O METODO CONSTRUTOR
        this.tampada = true;
        this.cor = "Azul";
    }
    public String getModelo(){
        return this.modelo;
    }
    public void  setModelo(String m){
        this.modelo = m;
    }
    public  float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public  void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.tampada);
        System.out.println("Tampada: " + this.cor);
    }
    public void tampar(){
        this.tampada = true;
    }
}
