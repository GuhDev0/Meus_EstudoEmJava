package Aula01_criando_objeto;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
 public void status(){
        System.out.println("uma caneta da cor " + this.cor);
        System.out.println("essa caneta esta tampada ? " + this.tampada);
        System.out.println("essa caneta tem a ponta " + this.ponta);
    }
      public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Esta Caneta esta tampada Você não pode rabiscar");
        }else {
            System.out.println("Você Esta Rabiscando");
        }
    }
    public void tampar(){
    this.tampada = true;
    }
   public void destampar(){
    this.tampada = false;
    }
}
