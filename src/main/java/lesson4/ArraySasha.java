package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArraySasha {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Steve");
        words.add("Tim");
        words.add("Lucy");
        words.add("Steve");
        words.add("Pat");
        words.add("Angela");
        words.add("Tom");
        words.add("Tim");
        words.add("Anna");
        words.add("Lucy");

        HashSet<String> uniqueWords = new HashSet<>(words);  //creates hashSet from the list to remove duplicates
        ArrayList<String> list = new ArrayList<>(uniqueWords);  //converts array to list
        Collections.sort(list);  //sorts the list
        System.out.println(list);  //prints the sorted list without duplicates
    }
}
