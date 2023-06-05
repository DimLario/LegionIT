package stringsLesson;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Vasily";
        String gender = "mail";
        int age = 20;
        double salary = 5000.50d;
        System.out.println("The name is " + name + ", gender is " + gender + ", age is " + age + ", salary is " + salary);
        System.out.println(String.format("The name is %s, gender is %s, age is %d, salary is %f", name, gender, age, salary));
        //formats the String automatically for printing
    }
}
