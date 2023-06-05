package selfTraining;

public class SumOfNums {
    int sum(int a, int b, int c){  //creates a method sum
        int result = a+b+c;        //function of the method sum
        return result;             //output of the method sum (a+b+c)
    }
}
class StartTask {
    public static void main(String[] args) {
        SumOfNums s = new SumOfNums();           //creates an object for the class sum
        int threeNums = s.sum(1, 2, 3); //calls method sum from class SumOfNums
        System.out.println(threeNums);           //prints the sum of the above numbers
        System.out.println(s.sum(5, 10, 15));  //prints the sum of 5, 10 and 15
    }
}
