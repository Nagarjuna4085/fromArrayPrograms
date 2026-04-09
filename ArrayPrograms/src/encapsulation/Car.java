package encapsulation;

public class Car {
    // Private variables
    private String company_name;
    private String model_name;
    private int year;
    private double mileage; // This will be Read-Only from the outside

    public Car(String company, String model, int year, double mileage) {
        this.company_name = company;
        this.model_name = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Standard Getters and Setters for Company, Model, and Year
    public String getCompany_name() { return company_name; }
    public void setCompany_name(String company_name) { this.company_name = company_name; }

    public String getModel_name() { return model_name; }
    public void setModel_name(String model_name) { this.model_name = model_name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // ONLY a Getter for Mileage (No Setter)
    public double getMileage() {
        return mileage;
    }
    
    // Pro-Tip: In a real app, you'd have a method to INCREASE mileage,
    // rather than a setter to CHANGE it to any value.
    public void drive(double distance) {
        if (distance > 0) {
            this.mileage += distance;
        }
    }
}