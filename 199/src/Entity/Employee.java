package Entity;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method to get annual salary
    public double getAnnualSalary() {
        return salary * 12;
    }


    public double raiseSalary(int percent) {
        salary += salary * percent / 100.0;
        return salary;
    }


    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}

