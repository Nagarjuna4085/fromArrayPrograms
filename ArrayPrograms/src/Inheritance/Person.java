package Inheritance;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        // Create a Person
        Person p = new Person("John", "Doe");
        System.out.println("Person: " + p.getFirstName() + " " + p.getLastName());

        // Create an Employee
        Employee01 e = new Employee01("Jane", "Smith", "E102", "Developer");
        
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Full Name with Title: " + e.getFirstName() + " " + e.getLastName());
    }
}

class Employee01 extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee01(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName); // Pass names to the Person constructor
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        // We use super.getLastName() to get the original name, then add the title
        return super.getLastName() + " (" + jobTitle + ")";
    }
}