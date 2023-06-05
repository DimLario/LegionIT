package selfTraining.Enum;

import java.io.*;
import java.util.Scanner;

public class Game2 {
    enum GameType {               //enum creates final constants (impossible to change them)
        SOCCER("Soccer.txt", "11 players in the team"),
        HOCKEY("Hockey.txt", "6 players in the team"),
        RUGBY("Rugby.txt", "15 players in the team");

        String fileName;
        String players;
        GameType(String fileName, String players) {
            this.fileName = fileName;
            this.players = players;
        }
    }

    public static String getFileName(Game2.GameType type) {
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
        catch (Exception err) {                        // catches wrong method
            System.out.println("Something went wrong");
        }
        return fileName;
    }


    public static void writeNumOfPlayersPerTeam(Game2.GameType game){
        try {
            FileWriter fileWriter = new FileWriter(game.fileName);
            fileWriter.write(game.players);                                    //insert our text into the created file
            fileWriter.close();                                        //closes the created file
        } catch (IOException e) {
            System.out.println("Error. Cannot wright...");
            e.printStackTrace();
        }
    }


    public static void readFromFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            for (int i=0; scanner.hasNextLine(); i++){  //reads from file until it has lines with text
                String row = scanner.nextLine();
                System.out.println(row);                //prints text from each line
            }
            scanner.close();                            //closes the scanner (required for scanner)
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
