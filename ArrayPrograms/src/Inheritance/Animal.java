package Inheritance;

// The Parent Class
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public static void main(String[] args) {
        // 1. Create a generic Animal
        Animal myAnimal = new Animal();
        System.out.print("Animal says: ");
        myAnimal.makeSound();

        // 2. Create a Cat (which is an Animal)
        Cat myCat = new Cat();
        System.out.print("Cat says: ");
        myCat.makeSound();

        // 3. Polymorphism: An Animal reference holding a Cat object
        Animal polyCat = new Cat();
        System.out.print("Polymorphic Cat says: ");
        polyCat.makeSound(); 
    }
}

// The Subclass (In the same file, so no 'public' keyword)
class Cat extends Animal {
    @Override
    public void makeSound() {
        // As per the requirement to make the Cat "bark"
        System.out.println("Bark");
    }
}