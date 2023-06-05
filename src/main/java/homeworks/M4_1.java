package homeworks;

public class M4_1 {
    public static void main(String[] args) {

        String txt1 = "category";
        String txt2 = "cat";
//        String txt1 = "cat";
//        String txt2 = "cat";
//        String txt1 = "";
//        String txt2 = "cat";

        if (txt1 == null || txt2 == null || txt1.isEmpty() || txt1.isBlank() || txt2.isEmpty() || txt2.isBlank()) {
            System.out.println("Cannot compare Strings");
        } else if (txt1.equals(txt2)) {
            System.out.println("The Strings are the same");
        } else if (txt1.contains(txt2)) {
            System.out.println("Word " + txt2 + " is a part of the word " + txt1 + ".");
        }
    }
}
