package homeworks;

import java.util.HashMap;
import java.util.Scanner;

public class M5Toys {
    public String getToy (int id){
        HashMap<Integer, String> toys = new HashMap<>();  //you can use String and String as well
        toys.put(12, "Batmobile");
        toys.put(45, "Light Saber");
        toys.put(6, "Wonder Woman");
        toys.put(201, "Kitty Bag");
        toys.put(56, "Junior QA Analyst Doll");
        if(toys.containsKey(id))  // checks id
           return toys.get(id);  //returns value based on the provided id
        return "No such toy"; // returns "No such toy" if id is not in the list
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // reads input from keyboard
        System.out.println("Enter the Toy ID and press Enter"); // ask to input id from keyboard
//        int id = Integer.parseInt(scanner.next()); // get an input as an Integer from keyboard
        int id = scanner.nextInt(); // get an input as an Integer from keyboard
        M5Toys m5Toys = new M5Toys();  // crates class instance
//        System.out.println(m5Toys.getToy(id));  // same thing as the next 2 lines
        String toy = m5Toys.getToy(id);
        System.out.println(toy);  // prints toy's name for the entered ID number
    }
}

