public class Champion {
    String nome;
    int vida;
    int ataque;
    int defesa;
    int velocidade;

    public Champion(String nome,int vida,int ataque,int defesa,int velocidade){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    public static boolean verificarVida(Champion champion1,Champion champion2){
        if(champion1.vida <= 0){
            System.out.println( champion1.nome + " Morreu");
        }
        if(champion2.vida <= 0){
            System.out.println(champion2.nome + " Morreu");
        }
        return  champion1.vida > 0 && champion2.vida > 0 ;
    }
    public void dano(Champion inimigo){
        int dano = ataque - inimigo.getDefesa();
        double porcetagem = 0.10;
        if(dano <= 0){
             int danoMinimo = (int)(ataque * porcetagem);
             dano = Math.max(1,danoMinimo - (inimigo.getDefesa() / danoMinimo)) ;
            System.out.println(nome + " causou dano direto: " + danoMinimo);
        }else {
            System.out.println(nome + " causou dano direto: " + dano);
        }

        int vidaPerdida = inimigo.getVida() - dano;
        inimigo.setVida(vidaPerdida);
    }
    public static void primeiroAtaque(Champion champion1,Champion champion2 ){

        if(champion1.velocidade > champion2.velocidade){
            champion1.dano(champion2);
            System.out.println(champion1.nome + " Bateu primeiro ");
        } else if (champion2.velocidade > champion1.velocidade) {
            champion2.dano(champion1);
            System.out.println(champion2.nome + " Bateu primeiro ");
        }else{
            System.out.println("Velocidade igual ! ambos atacam");
            champion1.dano(champion2);
            champion2.dano(champion1);
        }

    }
    public void statusCampeao(){
        System.out.println("----Status----");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defesa: " + getDefesa());
        System.out.println("Velocidade: " + getVelocidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
