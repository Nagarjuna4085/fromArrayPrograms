package ClassAndConstructor;

import java.util.ArrayList;

public class Student {

    String name;
    String grade;
    ArrayList<String> courses;

    // Constructor
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Add course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Remove course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
        } else {
            System.out.println(course + " not found!");
        }
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating student object
        Student s1 = new Student("John", "A");

        // Adding courses
        s1.addCourse("Java");
        s1.addCourse("Python");
        s1.addCourse("SQL");

        System.out.println("After adding courses:");
        s1.display();

        // Removing a course
        s1.removeCourse("Python");

        System.out.println("After removing course:");
        s1.display();
    }
}