package homeworks.M6;

public class Clerk extends Employee{
    public Clerk(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }
    public String getTask(){
        return "  Responsibilities: \n" + "Clerk's role is to call to the customer and answer incoming calls.";
    }
}
