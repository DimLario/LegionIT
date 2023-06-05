package bankApp;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John Smith", 1, "10.01.2000");
        Accountant accountant1 = new Accountant("Anna White", 2, "09.12.1997");
        Clerk clerk1 = new Clerk("Sophy Strong", 3, "12.31.1972");

        System.out.println(manager1.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk1.toString());

        manager1.FireEmployee("Anna White");
        manager1.HireEmployee("Bob Dillan");
        accountant1.CreateReport();
        clerk1.MakeCall("Rick Flotner");
        clerk1.GetCall("Barak Obama");

        accountant1.setName("Bob Dillan");
        System.out.println(accountant1.toString());
    }
}
