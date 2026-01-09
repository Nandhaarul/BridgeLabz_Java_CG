package CoreProgramming.AccessModifiers;


import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double cgpa = sc.nextDouble();

        PostgraduateStudent pg = new PostgraduateStudent(roll, name, cgpa);
        pg.displayDetails();

        double newCgpa = sc.nextDouble();
        pg.setCGPA(newCgpa);

        pg.displayDetails();

        sc.close();
    }
}
