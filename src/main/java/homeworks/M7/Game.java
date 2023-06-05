package homeworks.M7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static String getFileName(GameType type) {
        String fileName = null;
        try {
            switch (type) {
                case SOCCER:
                    fileName = "Soccer.txt";
                    break;
                case HOCKEY:
                    fileName = "Hockey.txt";
                    break;
                case RUGBY:
                    fileName = "Rugby.txt";
                    break;
            }
        }
        catch (Exception err) {
            System.out.println("Something went wrong");
        }
        return fileName;
    }

    public static String getPlayers(GameType type) {
        String players = null;
        try {
            switch (type) {
                case SOCCER:
                    players = "11 players in the Soccer team";
                    break;
                case HOCKEY:
                    players = "5 players in the Hockey team";
                    break;
                case RUGBY:
                    players = "15 players in the Rugby team";
                    break;
            }
        }
        catch (Exception err) {
            System.out.println("Something went wrong");
        }
        return players;
    }


    public static void writeNumOfPlayersPerTeam(GameType game){
        try {
            FileWriter fileWriter = new FileWriter(getFileName(game));
            fileWriter.write(getPlayers(game));                  //inserts the text into the created file
            fileWriter.close();                                  //closes the created file
        } catch (IOException e) {
            System.out.println("Error. Cannot wright...");
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            for (int i=0; scanner.hasNextLine(); i++){  //reads from the file until lines with text finish
                String row = scanner.nextLine();
                System.out.println(row);                //prints text from each line
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
