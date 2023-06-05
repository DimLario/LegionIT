package stringsLesson;

public class Conversions {
    public static void main(String[] args) {
//        String txt = "5";
//        int intTxt = Integer.parseInt(txt);  //converts String to int
//        int result1 = intTxt + 2;
//        System.out.println(result1);
        int i = 555;
        String result2 = String.valueOf(i);  //converts int to String
        System.out.println(result2);         //prints the String converted from int
        System.out.println(result2.length());  //prints quantity of characters for the String
    }
}
