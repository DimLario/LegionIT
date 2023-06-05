package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
        Lesson2MainLoops loops = new Lesson2MainLoops();
        //loops.countNumber(1);
        //loops.countNumber();
        loops.numbersTemplate(9);
    }

    public void countNumber(int i) {
//         System.out.println(i);
//         System.out.println(i+1);
//         System.out.println(i+2);
        while (i <= 100) {
            System.out.println(i);
            //i = i + 1;
            i++;
        }
    }

    public void countNumber() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //1
    //1 2
    //1 2 3
    //1 2 3 4
    public void numbersTemplate(int rows){
        for (int i = 1; i <= rows; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
            if (i == 7){
                break;
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        }
}