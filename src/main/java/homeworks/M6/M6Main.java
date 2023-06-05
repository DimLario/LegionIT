package homeworks.M6;

public class M6Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("  Managers:");
        Employee mng = new Manager("Mark White", 122, "Manager", "05-07-1987", 10000, "Montreal");
        System.out.println(mng.toString());
        System.out.println(mng.getTask());
        System.out.println("-----------------------------------------");

        System.out.println("  Accountants:");
        Employee acc1 = new Accountant("John Smith", 111, "Accountant", "01-01-2000", 5000, "Toronto");
        System.out.println(acc1.toString());
        Employee acc2 = new Accountant("Tom Waits", 112, "Accountant", "12-01-2001", 5000, "Hamilton");
        System.out.println(acc2.toString());
        Employee acc3 = new Accountant("John Right", 113, "Accountant", "05-20-1985", 5000, "Richmond Hill");
        System.out.println(acc3.toString());
        Employee acc4 = new Accountant("Olga Petrova", 114, "Accountant", "10-30-1972", 5000, "Toronto");
        System.out.println(acc4.toString());
        Employee acc5 = new Accountant("Megh Patel", 115, "Accountant", "07-04-1980", 5000, "Vaughan");
        System.out.println(acc5.toString());

        System.out.println(acc1.getTask());
        System.out.println("-----------------------------------------");

        System.out.println("  Clerks:");
        Employee clk1 = new Clerk("Anna Yellow", 133, "Clerc", "03-06-1981", 3000, "Calgary");
        System.out.println(clk1.toString());
        Employee clk2 = new Clerk("Bob One", 134, "Clerc", "01-06-1985", 3000, "Newmarket");
        System.out.println(clk2.toString());
        Employee clk3 = new Clerk("Jannet Green", 135, "Clerc", "03-06-1981", 3000, "Toronto");
        System.out.println(clk3.toString());

        System.out.println(clk1.getTask());
        System.out.println("-----------------------------------------");
    }
}
