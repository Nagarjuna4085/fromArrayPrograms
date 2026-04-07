package ClassAndConstructor;

public class Employee {

    String name;
    String jobTitle;
    double salary;

    // Constructor
    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to update salary (give raise)
    public void updateSalary(double amount) {
        salary = salary + amount;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + calculateYearlySalary());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating employee objects
        Employee e1 = new Employee("John", "Developer", 5000);
        Employee e2 = new Employee("Alice", "Manager", 8000);

        // Display original data
        System.out.println("Before Salary Update:");
        e1.display();
        e2.display();

        // Updating salary
        e1.updateSalary(1000); // raise
        e2.updateSalary(1500);

        // Display updated data
        System.out.println("After Salary Update:");
        e1.display();
        e2.display();
    }
}