package selfTraining;

public class M7SelfLearning {
    int result = -1;

    public int Arrays() {
        this.result = -1;
        String[] userArray = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] corArray = {"cata", "blue", "sky", "umbrella", "paddy"};

        if (userArray[0] == corArray[0]) {
            result = 1;
            return result;
//            System.out.print("[" + " " +result);
        }
        if (userArray[1] == corArray[1]) {
            result = 1;
//            System.out.print(result);
        }
        if (userArray[2] == corArray[0]) {
            result = 1;
//            System.out.print(result);
        }
        return -1;
    }

    public static void main(String[] args) {
        M7SelfLearning m7SelfLearning = new M7SelfLearning();
        m7SelfLearning.Arrays();
        int result1 = m7SelfLearning.result;
        System.out.println(result1);
    }
}
