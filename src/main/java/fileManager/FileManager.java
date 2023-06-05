package fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "LegionFile.txt";                               //name and extension of the created file

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);                                 //creates a file
        fileManager.wrightToFile(file, "Here is the text :-) \n" + "Here is the text :-) \n" + "Here is the text :-) \n");  //this text is going to be inside the file
        fileManager.readFromFile(file);
        fileManager.deleteFile(file);
    }
    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
    public void wrightToFile(String fileName, String text){

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);                                    //insert our text into the created file
            fileWriter.close();                                        //closes the created file
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Error. Cannot wright...");
            e.printStackTrace();
        }
    }
    public void readFromFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()){
//                String row = scanner.nextLine();  //reads the text in the created file from the beginning and stops at the last line
//                System.out.println(row);          //prints the text from the file
//            }
          //another way to read from file:
            for (int i=0; scanner.hasNextLine(); i++){  //reads from file until it has lines with text
                String row = scanner.nextLine();
                System.out.println(i);                  //prints a number of each next line
                System.out.println(row);                //prints text from each line
            }
            scanner.close();                            //closes the scanner (required for scanner)
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteFile(String fileName){
        File file = new File(fileName);
        if (file.exists());{                     //check file for existence before deleting
            file.delete();                       //deletes the file
        }
    }
}
