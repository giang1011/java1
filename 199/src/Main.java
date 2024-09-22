import Entity.Employee;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng 3 nhân viên mới
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "John", "Smith", 3000);
        employees[1] = new Employee(2, "Indiana", "John", 4000);
        employees[2] = new Employee(3, "Bill", "Gate", 3500);


        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


        Employee maxEmployee = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = emp;
            }
        }

        System.out.println("\nEmployee with highest annual salary:");
        System.out.println(maxEmployee + " with an annual salary of " + maxEmployee.getAnnualSalary());
    }
}