package homeworks.M6;

public class Manager extends Employee{
    public Manager(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }
    public String getTask(){
        return "  Responsibilities: \n" + "The manager should be able to hire and fire employees.";
    }
}
