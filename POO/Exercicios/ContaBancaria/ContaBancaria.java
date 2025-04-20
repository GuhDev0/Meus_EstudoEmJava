package Exercicios.ContaBancaria;

public class ContaBancaria {
    public  int numConta;
    protected String tipo;
    private  String user;
    private  float saldo;
    private  boolean status;


    public ContaBancaria(float saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    public  void abrirConta(String name,String setTipo,int numConta){
        this.user = name;
        this.tipo = setTipo;
        if( setTipo.equals("CP")){
           tipo = "Conta Poupaça";
            status = true;
            saldo = 150f;

        } else if (setTipo.equals("CC")) {
            tipo = "Conta Corrente";
            status = true;
            saldo = 50f;
        }else {
            System.out.println("Conta Invalida");
        }
    }
    public  void fecharConta(){
        if(saldo > 0 ){
            System.out.println("Conta precisa esta sem saldo pra efetuar o fechamento");
        }else if(saldo < 0){
            System.out.println("Voce Continua em debito, efetue o pagamento para pode fecha a conta");
        }else{
            status = false;
            user = null;
            System.out.println("Conta Fechada Com Sucesso");
        }
    }
    public void depositar(float valueDepositado){
        float saldoDepositado =   saldo + valueDepositado ;
        this.saldo = saldoDepositado;
        System.out.println("Voce depositou : " + valueDepositado);
    }
    public void sacar(float valueSacado){
        float sacado =  saldo - valueSacado ;
        this.saldo = sacado;
        System.out.println("Voce Sacou : " + valueSacado);
    }
    public  void pagarMensal(){
          float value = saldo - 12 ;
          this.saldo = value;
          System.out.println("Foi Cobrado " + 12 + " Reais Mensal da sua conta");
    }

    public void print(){
            System.out.println("user : " + user);
            System.out.println("Tipo da Conta : " + tipo);
            System.out.println("Saldo da Conta : " + saldo);
            System.out.println("Status da Conta : ativa" );
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
