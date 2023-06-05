package stringsLesson;

public class StringMain {
    public static void main(String[] args) {
     StringMain stringsMain = new StringMain();
     int res = stringsMain.sumOfTwoNumbers(2,4);
        System.out.println("The result is " + res);
        System.out.println(stringsMain.getText());
    }
    public int sumOfTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public String getText(){
        return "blablabla";
    }
}
