package stringsLesson;

public class ReverseString {
    //reverse dog --> god
    //get the last letter "g" (length-1) and add it as a first letter for the new word
    //use the same idea to create the loop for all letters
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("automation");
    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            String result = "";
            System.out.println(String.format("The input string is %s", textToReverse));
            int lastletter = textToReverse.length() - 1;
            for (int i = lastletter; i>=0; i--){
                result = result + textToReverse.charAt(i);
            }
            System.out.println("The reversed word is " + result);
        }
    }
}
