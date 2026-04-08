package Inheritance;


public class Animal01 {
    public void move() {
        System.out.println("The animal moves in a general way.");
    }

    public static void main(String[] args) {
        // Create an Animal object
    	Animal01 genericAnimal = new Animal01();
        genericAnimal.move();

        // Create a Cheetah object
        Cheetah myCheetah = new Cheetah();
        myCheetah.move();

        // Polymorphism: Animal reference, Cheetah object
        Animal01 polyCheetah = new Cheetah();
        polyCheetah.move(); // This will still print "The cheetah runs!"
    }
}

class Cheetah extends Animal01 {
    @Override
    public void move() {
        System.out.println("The cheetah runs at 70 mph!");
    }
}