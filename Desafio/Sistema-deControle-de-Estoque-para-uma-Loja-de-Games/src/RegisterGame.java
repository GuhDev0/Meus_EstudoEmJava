import java.util.ArrayList;

public class RegisterGame {
     ArrayList<Game> listGamers = new ArrayList<Game>();

    public  void registerGame(String user_gamer,String user_platform ,String user_developer){
        Game game_one = new Game(user_gamer,user_platform,user_developer);
        listGamers.add(game_one);
    }
    public  ArrayList<Game> getListGamers(){
        return listGamers;
    }
}
