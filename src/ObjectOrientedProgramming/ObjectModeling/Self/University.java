package ObjectOrientedProgramming.ObjectModeling.Self;

import java.util.ArrayList;

class Faculty {
    String name;
    String specialization;

    Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void displayFaculty() {
        System.out.println("Faculty Name: " + name + ", Specialization: " + specialization);
    }
}

class Department {
    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

class University {
    String universityName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> facultyMembers = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void displayUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            f.displayFaculty();
        }
    }

    public static void main(String[] args) {

        Faculty f1 = new Faculty("Nandha Arul", "Computer Science");
        Faculty f2 = new Faculty("Rahul", "Mathematics");

        University university = new University("ABC University");

        university.addDepartment("Engineering");
        university.addDepartment("Science");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.displayUniversityDetails();

        university = null;
        System.gc();

        f1.displayFaculty();
        f2.displayFaculty();
    }
}
