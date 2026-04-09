package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // Private variables
    private int student_id;
    private String student_name;
    // We use a List to store multiple grades
    private List<Double> grades;

    public Student(int id, String name) {
        this.student_id = id;
        this.student_name = name;
        this.grades = new ArrayList<>(); // Initialize the list
    }

    // Standard Getters and Setters for ID and Name
    public int getStudent_id() { return student_id; }
    public void setStudent_id(int student_id) { this.student_id = student_id; }

    public String getStudent_name() { return student_name; }
    public void setStudent_name(String student_name) { this.student_name = student_name; }

    // Getter for grades - usually returns a copy to prevent outside tampering
    public List<Double> getGrades() {
        return new ArrayList<>(grades); 
    }

    // The "Action" Method instead of a simple Setter
    public void addGrade(double grade) {
        // Validation: Grade must be between 0 and 100
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
            System.out.println("Grade " + grade + " added for " + student_name);
        } else {
            System.out.println("Invalid grade! Please enter a value between 0 and 100.");
        }
    }
}