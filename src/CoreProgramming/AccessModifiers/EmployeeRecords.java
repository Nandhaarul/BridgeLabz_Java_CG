package CoreProgramming.AccessModifiers;

import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        double salary = sc.nextDouble();

        Manager manager = new Manager(id, dept, salary);
        manager.displayDetails();

        double newSalary = sc.nextDouble();
        manager.setSalary(newSalary);

        manager.displayDetails();

        sc.close();
    }
}

