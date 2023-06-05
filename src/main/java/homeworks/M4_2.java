package homeworks;

public class M4_2 {
    public boolean isPalindrome(String text) {
        text = text.toLowerCase();  //converts all letters to lower case
        int lastChar = text.length() - 1;
        String reversedText = "";
        for (int i = lastChar; i >= 0; i--) {  //takes letters one by one starting the end of the word
            reversedText += text.charAt(i);  //creates a new word by adding letters with opposite order
        }
        return text.equals(reversedText);  //compares original word to the new one and return true or false
    }
    public static void main(String[] args) {
        M4_2 word = new M4_2();
        boolean result = word.isPalindrome("RaceCar");  //palindrome
//        boolean result = word.isPalindrome("Carrace");  //not a palindrome
        System.out.println(result);
    }
}

