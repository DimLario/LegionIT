package homeworks.M6;

public abstract class Employee {

    private String name;
    private int id;
    private String title;
    private String dateOfBirth;
    private int salary;
    private String address;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String name, int id, String title, String dateOfBirth, int salary, String address){
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }
    public abstract String getTask();

    @Override
    public String toString() {
        return "Name: " + name +
                ", ID: " + id +
                ", Title: " + title +
                ", Date of birth: " + dateOfBirth +
                ", Salary: $" + salary +
                ", Address: " + address;
    }
}
