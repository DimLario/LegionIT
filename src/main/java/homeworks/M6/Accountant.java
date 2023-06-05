package homeworks.M6;

public class Accountant extends Employee{
    public Accountant(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }
    public String getTask(){
        return "  Responsibilities: \n" + "The accountant can open a new account, close account and create reports.";
    }
}
