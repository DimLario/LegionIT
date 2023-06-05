package lesson4;

import java.util.*;

public class ArrayExamples {
    public void stringsArray() {
        String[] buttons = {"OK", "Cancel", "Login", "Signup", "X"}; //only 5 variables, cannot be changed later
        buttons[2] = "Exit"; //Replacing "Cancel" button with "Exit" button
        int length = buttons.length; //buttons quantity
        System.out.println(buttons[2]);  //prints variable #2
        System.out.println("The array length: " + length);  //prints "length: " and total quantity of variables
        System.out.println("-------------------------");
        for (int i = 0; i < buttons.length; i++) {
            System.out.println(buttons[i]);  //prints ALL values of buttons (entire array)
        }
        System.out.println("-------------------------");
        for (String button : buttons) {    //prints ALL values of buttons (entire array)
            System.out.println(button);
        }
        System.out.println("-------------------------");
    }

    public void stringsArrayWithSize() {
        String[] array = new String[7]; //array has a limit 7 variables
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "Signup";
        array[5] = "X";  // we added only 5 variables out of 7, 2 are empty and can be added later
        System.out.println("The array length: " + array.length);
        System.out.println("-------------------------");
    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 8};
        System.out.println("The integer #4 is: " + ids[3]);  //prints integer #4 from the array
        System.out.println("-------------------------");
    }

    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>(); //unlimited array, variables can be added any time
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Logout");
        buttons.add("Exit");

        System.out.println("The buttons in the array are: ");
        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));     //prints ALL values of buttons (current array completely)

        }
        System.out.println("-------------------------");

        for (String button : buttons) {    //prints ALL values of buttons (current array completely)
            System.out.println(button);
        }
        System.out.println("The size of the list is: " + buttons.size());
        buttons.add("New button");
        System.out.println("-------------------------");

        for (String button : buttons) {    //prints ALL values of buttons (current array completely)
            System.out.println(button);
        }
        System.out.println("-------------------------");

        buttons.remove("Exit");  //removes object "Exit" from the array
        for (String button : buttons) {    //prints ALL values of buttons (current array completely)
            System.out.println(button);
        }
        System.out.println("-------------------------");
        buttons.clear();  //removes ALL objects from the array
        for (String button : buttons) {    //prints ALL values of buttons (current array completely)
            System.out.println(button);
        }
        System.out.println("The size of the list is: " + buttons.size());
        System.out.println("-------------------------");
    }

    public void arrayListSorting() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //unlimited array, variables can be added any time
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(98);
        arrayList.add(205);

        Collections.sort(arrayList);  //sorts all numbers from the array
        System.out.println("Here are the sorted numbers: ");
        for (Integer i : arrayList) {
            System.out.println(i);  //prints sorted numbers from the array
        }
        System.out.println("-------------------------");
    }

    public void hashMapExample() {
        //       key    object                          key    object      key MUST be unique
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();  //you can use String and String as well
        hashMap.put("John", 1972);
        hashMap.put("Kate", 2000);
        hashMap.put("Moshe", 1999);
        System.out.println("Here are all hashMap keys and objects:");
        System.out.println(hashMap);  //prints all hashMap keys and objects

        System.out.println(hashMap.get("Moshe"));  //prints object for the key "Moshe"

        hashMap.remove("John");  //removes key "John"
        System.out.println(hashMap.size());  //prints quantity of the hashMap keys/objects (MINUS 1)
        System.out.println(hashMap);  //prints all hashMap keys and objects
        System.out.println("-------------------------");
    }

    public void hashSetExample() {
        //     key only (unique parameter)
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
        hashSet.add("Anna");
        hashSet.add("Anna");
        hashSet.add("John");
        System.out.println("Here are all hashSat keys:");
        System.out.println(hashSet);  //prints all keys from the hashSet in random order
        System.out.println("-------------------------");
//converts hashSet to list ->
        List<String> list = new ArrayList<String>(hashSet);  //creates a list (array) contains keys from the hashSet
        Collections.sort(list);  //sorts the list in alphabetical order
        System.out.println("The sorted list of the keys:");
        System.out.println(list);
        System.out.println("-------------------------");
    }
}