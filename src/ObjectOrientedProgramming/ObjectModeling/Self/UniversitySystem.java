import java.util.ArrayList;

class Learner {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Learner(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addLearner(this);
        }
    }

    void displayCourses() {
        System.out.println("Learner: " + name);
        for (Course c : courses) {
            System.out.println("Enrolled Course: " + c.courseName);
        }
    }
}

class Professor {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }

    void displayCourses() {
        System.out.println("Professor: " + name);
        for (Course c : courses) {
            System.out.println("Teaching Course: " + c.courseName);
        }
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Learner> learners = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void addLearner(Learner learner) {
        if (!learners.contains(learner)) {
            learners.add(learner);
        }
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Learners:");
        for (Learner l : learners) {
            System.out.println(l.name);
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Learner l1 = new Learner("Nandha Arul");
        Learner l2 = new Learner("Rahul");

        Professor p1 = new Professor("Dr. Kumar");
        Professor p2 = new Professor("Dr. Anita");

        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Data Structures");

        l1.enrollCourse(c1);
        l1.enrollCourse(c2);

        l2.enrollCourse(c1);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        l1.displayCourses();
        l2.displayCourses();

        p1.displayCourses();
        p2.displayCourses();

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
