package bankApp;
public class Manager extends Employee {
    public Manager(String name, int id, String dateOfBirth) {
        super(name, id, 10000, Consts.MANAGER_TITLE, dateOfBirth);
    }
    public void HireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was hired ", employeeName));
    }
    public void FireEmployee(String employeeName){
        System.out.println(String.format("The employee %s was fired ", employeeName));
    }
}
