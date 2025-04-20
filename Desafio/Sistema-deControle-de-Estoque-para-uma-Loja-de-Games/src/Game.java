public class Game  {
    private String nameOfGame;
    private  String platform;
    private String developer;

    public Game(String ng,String pt,String dl){
        nameOfGame = ng;
        platform = pt;
        developer = dl;
    }

    @Override
    public String toString() {
        return "Game{" +
                "nameOfGame='" + nameOfGame + '\'' +
                ", platform='" + platform + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
