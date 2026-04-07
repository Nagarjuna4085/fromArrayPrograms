package ClassAndConstructor;

import java.time.LocalDate;
import java.time.Period;

public class Employee01 {

    String name;
    double salary;
    LocalDate hireDate;

    // Constructor
    Employee01(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }

    // Display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating employees
        Employee01 e1 = new Employee01("John", 5000, LocalDate.of(2020, 5, 10));
        Employee01 e2 = new Employee01("Alice", 7000, LocalDate.of(2018, 3, 20));

        // Display
        e1.display();
        e2.display();
    }
}