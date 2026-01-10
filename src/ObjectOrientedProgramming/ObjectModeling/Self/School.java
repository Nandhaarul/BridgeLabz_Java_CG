package ObjectOrientedProgramming.ObjectModeling.Self;
import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    void displayCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.name);
        }
    }

    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student("Nandha Arul");
        Student s2 = new Student("Rahul");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");
        Course c3 = new Course("Data Structures");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);
        s2.enrollCourse(c3);

        s1.displayCourses();
        s2.displayCourses();

        c1.displayEnrolledStudents();
        c2.displayEnrolledStudents();
        c3.displayEnrolledStudents();
    }
}

