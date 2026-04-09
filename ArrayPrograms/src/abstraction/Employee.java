package abstraction;

public abstract class Employee {

//5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

	protected double salary;
	String role;
	String name;
	Employee(String name,String r,double s){
		this.salary = s;
		this.name = name;
		this.role = r;
		
	}

	public abstract double calculateSalary();

	public abstract String displayInfo();

}

 class Manager extends Employee{
		
	Manager(String n,double s){
		super(n,"Manager",s);
		
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return salary*30 ;
	}
	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		return "name" + name + "  role is" + "Manager";
	}
	}
}
 
 class Programmer extends Employee{
		
	 Programmer(String n,double s){
		super(n,"Programmer",s);
		
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return salary*30 ;
	}
	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		return "name" + name + "  role is" + "Programmer";
	}
}
