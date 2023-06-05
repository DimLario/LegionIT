package bankApp;
public class Clerk extends Employee{
    public Clerk(String name, int id, String dateOfBirth) {
        super(name, id, Consts.DEFAULT_CLERK_SALARY, Consts.CLERK_TITLE, dateOfBirth);
    }
    public void MakeCall(String customerName){
        System.out.println(String.format("Connected to customer %s", customerName));
    }
    public void GetCall(String customerName){
        System.out.println(String.format("Answered to customer %s", customerName));
    }
}
