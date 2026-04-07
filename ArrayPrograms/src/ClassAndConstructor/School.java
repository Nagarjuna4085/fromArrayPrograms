package ClassAndConstructor;

import java.util.ArrayList;

public class School {

    ArrayList<String> students;
    ArrayList<String> teachers;
    ArrayList<String> classes;

    // Constructor
    School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    // ---------------- Students ----------------
    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        if (!students.remove(student)) {
            System.out.println(student + " not found!");
        }
    }

    // ---------------- Teachers ----------------
    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(String teacher) {
        if (!teachers.remove(teacher)) {
            System.out.println(teacher + " not found!");
        }
    }

    // ---------------- Classes ----------------
    public void createClass(String className) {
        classes.add(className);
    }

    public void removeClass(String className) {
        if (!classes.remove(className)) {
            System.out.println(className + " not found!");
        }
    }

    // Display all data
    public void displaySchool() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        School school = new School();

        // Add students
        school.addStudent("John");
        school.addStudent("Alice");

        // Add teachers
        school.addTeacher("Mr. Smith");
        school.addTeacher("Mrs. Brown");

        // Create classes
        school.createClass("Math");
        school.createClass("Science");

        System.out.println("After Adding:");
        school.displaySchool();

        // Remove operations
        school.removeStudent("Alice");
        school.removeTeacher("Mr. Smith");
        school.removeClass("Math");

        System.out.println("After Removing:");
        school.displaySchool();
    }
}
