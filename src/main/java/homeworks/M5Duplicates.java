package homeworks;

import java.util.*;
public class M5Duplicates {
    public void arrayListDuplicates() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");
        Collections.sort(names);  //sorts all names from the above array

        LinkedHashSet<String> noDuplicates = new LinkedHashSet<>(names);  //creates hashSet from the array
        System.out.println("Here are the sorted names with no duplicates:");
        System.out.println(noDuplicates);  // prints the unique names only
    }

    public static void main(String[] args) {
        M5Duplicates m5Duplicates = new M5Duplicates();
        m5Duplicates.arrayListDuplicates();  //calls class M5Duplicates -> method arrayListDuplicates
    }
}