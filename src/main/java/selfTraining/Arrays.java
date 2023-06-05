package selfTraining;

public class Arrays {
    public boolean twoTwo() {
        int[] has22 = {1, 2, 2, 3};
        for (int i = 0; i < has22.length - 1; i++) {
            if (has22[i] == 2 && has22[i + 1] == 2) {

                for (int has : has22) {    //prints ALL values of has22
//                    System.out.println(has);
                }

//                System.out.println(has22[i]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Arrays has22 = new Arrays();  //creates class instance
        has22.twoTwo();
        System.out.println(has22.twoTwo()); //calls a day based on the provided number
    }
}