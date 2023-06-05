package selfTraining.Enum;

public class Game2Main {
    public static void main(String[] args) {

        Game2.writeNumOfPlayersPerTeam(Game2.GameType.HOCKEY);
        Game2.writeNumOfPlayersPerTeam(Game2.GameType.SOCCER);
        Game2.writeNumOfPlayersPerTeam(Game2.GameType.RUGBY);

        Game2.readFromFile("Hockey.txt");
        Game2.readFromFile("Soccer.txt");
        Game2.readFromFile("Rugby.txt");
    }
}
