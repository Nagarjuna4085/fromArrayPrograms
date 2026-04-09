package abstraction;

public abstract class Animal {
	abstract public void sound();
	public static void main(String[] args) {
		Animal[] animals = {new Lion(),new Tiger()};
		
		for(Animal animal:animals) {
			animal.sound();
		}
	}
	

}

class Lion extends Animal{
	
	@Override
	public void sound() {
		System.out.println("sound from lion");
		
	}
	
}


class Tiger extends Animal{
	@Override
	public void sound() {
		System.out.println("sound from tiger");
	}
}