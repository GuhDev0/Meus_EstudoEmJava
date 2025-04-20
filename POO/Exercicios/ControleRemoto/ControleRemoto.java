package Exercicios.ControleRemoto;

public  class ControleRemoto implements Controllador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 0;
        ligado = false;
        tocando = false;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {

        if(getLigado()){
            System.out.println("Esta Ligada? " + getLigado() );
            System.out.println("Esta Tocando? " + getTocando());
            System.out.println("Volume " + getVolume());
            for(int i = 0;i <= this.getVolume();i+=10){
                System.out.println("|");
            };
        }else{
            System.out.println("controle desligado");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ....");
    }

    @Override
    public void aumentarVolume() {
    if(this.getLigado()){
        this.setVolume(getVolume() + 5);
    }
    }

    @Override
    public void diminuirVolume() {
    if(this.getLigado()){
        this.setVolume(getVolume() - 5);
    }
    }

    @Override
    public void ativarMudo() {
    if(this.getLigado() && this.getVolume() > 0){
        this.setVolume(0);
    }
    }

    @Override
    public void desativarMudo() {
    if(this.getLigado() && this.getVolume() == 0){
        this.setVolume(50);
    }
    }

    @Override
    public void play() {
    if(this.getLigado() && !(this.getTocando())){
        this.setTocando(true);
    }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
