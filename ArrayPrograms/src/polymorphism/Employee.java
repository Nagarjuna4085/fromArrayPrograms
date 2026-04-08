package polymorphism;

// Abstract base class - The "Template"
abstract class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Every subclass MUST implement this
    public abstract double calculateSalary();
    
    public String getName() { return name; }
}

// Subclass 1: Manager
class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Managers get base + bonus
        return baseSalary + bonus;
    }
}

// Subclass 2: Programmer
class Programmer extends Employee {
    double overtimePay;

    Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        // Programmers get base + overtime
        return baseSalary + overtimePay;
    }
}