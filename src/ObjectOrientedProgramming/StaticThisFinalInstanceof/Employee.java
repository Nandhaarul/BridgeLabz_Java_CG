package ObjectOrientedProgramming.StaticThisFinalInstanceof;

class Employee {

    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Nandha Arul", "Software Engineer");
        Employee e2 = new Employee(102, "Rahul", "Data Analyst");

        if (e1 instanceof Employee) {
            e1.displayEmployeeDetails();
        }

        if (e2 instanceof Employee) {
            e2.displayEmployeeDetails();
        }

        Employee.displayTotalEmployees();
    }
}
