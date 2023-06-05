package homeworks.M7;

public class GameMain {
    public static void main(String[] args) {

        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);

        Game.readFromFile("Hockey.txt");
        Game.readFromFile("Soccer.txt");
        Game.readFromFile("Rugby.txt");
    }
}
