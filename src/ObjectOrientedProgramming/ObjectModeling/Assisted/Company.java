package ObjectOrientedProgramming.ObjectModeling.Assisted;

import java.util.ArrayList;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}

class Department {
    String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department dev = new Department("Development");
        dev.addEmployee("Nandha Arul", "Software Engineer");
        dev.addEmployee("Rahul", "Backend Developer");

        Department hr = new Department("HR");
        hr.addEmployee("Anita", "HR Manager");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayCompanyDetails();

        company = null;
        System.gc();
    }
}
