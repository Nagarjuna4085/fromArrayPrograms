package encapsulation;

public class Employee {
    // Private variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    // Standard Getter/Setter for ID
    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    // Standard Getter/Setter for Name
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    // CUSTOM Getter for Salary (Data Transformation)
    // No setter provided as per the prompt instructions
    public String getFormattedSalary() {
        // We return a String instead of a double to control how it looks
        return String.format("$%.2f", employee_salary);
    }
}