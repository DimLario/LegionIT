package bankApp;
public class Accountant extends Employee {
    public Accountant(String name, int id, String dateOfBirth) {
        super(name, id, Consts.DEFAULT_ACCOUNTANT_SALARY, Consts.ACCOUNTANT_TITLE, dateOfBirth);
    }
    public void CreateReport(){
        System.out.println("Financial report created.");
    }
}
