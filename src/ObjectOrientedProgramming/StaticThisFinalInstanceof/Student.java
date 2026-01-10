package ObjectOrientedProgramming.StaticThisFinalInstanceof;


class Student {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Nandha Arul", "A");
        Student s2 = new Student(2, "Rahul", "B");

        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        s1.updateGrade(s1, "A+");

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        Student.displayTotalStudents();
    }
}
