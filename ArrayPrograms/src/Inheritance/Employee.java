package Inheritance;
import java.util.ArrayList;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working...");
    }

    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
    	HRManager hr = new HRManager(134567654.781);
    	hr.addEmployee(new Employee(34454345.67));
    	hr.addEmployee(new Employee(34454345.67));
    	hr.addEmployee(new Employee(34454345.67));
    	hr.addEmployee(new Employee(34454345.67));
    	hr.addEmployee(new Employee(34454345.67));
    	hr.addEmployee(new Employee(34454345.67));
    	
    	
	}
}

class HRManager extends Employee {
    // The collection of employees managed by HR
    private ArrayList<Employee> employees;

    public HRManager(double salary) {
        super(salary); // Calls the Employee constructor
        this.employees = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources...");
    }

    // New method specific to HRManager
    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("New employee added to the system.");
    }
}