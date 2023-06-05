package selfTraining;

public class BetweenLastChars {
    public static void main(String[] args) {
        String text = "Dog";
        int lastChar = text.length() - 1;
        String newText = "";
        newText = text.charAt(lastChar) + text + text.charAt(lastChar);  //creates a new word by adding the last letter in the end and in the beginning
        System.out.println(newText);
    }
}
