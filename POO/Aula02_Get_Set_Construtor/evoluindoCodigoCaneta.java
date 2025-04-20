package Aula02_Get_Set_Construtor;

public class evoluindoCodigoCaneta {
    private String modelo;
    private  String cor;
    public  evoluindoCodigoCaneta(String m,String c){
        this.modelo = m;
        this.setCor(c);
    }

    public void  setCor(String c){
        this.cor = c;
    }

    public  void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor Acessada " + cor);

    }
}
