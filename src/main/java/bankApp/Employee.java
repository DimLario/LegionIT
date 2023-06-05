package bankApp;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    private String position;

    public Employee(String name, int id, double salary, String position, String dateOfBirth) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
    }
    private String dateOfBirth;

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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void receiveSalary(){
        System.out.println("The salary was sent to the employee bank account");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
