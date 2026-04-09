package abstraction;

public abstract class Vehicle {
	// global variables
	private String brand;
	protected boolean isEngineOn = false;

	Vehicle(String b) {
		this.brand = b;

	}

	// start
	public abstract void Start();

	// stop
	public abstract void Strop();
	
	public static void main(String[] args) {
		Vehicle[] vhs = {new Car("to")};
	}

}


class Car extends Vehicle{
	Car(String b){
		super(b);
	}
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		isEngineOn = true;
		System.out.println("car is on");
		
	}@Override
	public void Strop() {
		// TODO Auto-generated method stub
		isEngineOn = false;
		System.out.println("car is off");
		
		
	}
	
}


class Bike extends Vehicle{
	Bike(String b){
		super(b);
	}
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		isEngineOn = true;
		System.out.println("bike is on");
		
	}@Override
	public void Strop() {
		// TODO Auto-generated method stub
		isEngineOn = false;
		System.out.println("bike is off");
		
		
	}
	
}
