package ClassAndConstructor;

public class Dog {

    String name;
    String breed;

    // Constructor
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to display details
    public void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Breed: " + breed);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating objects using constructor
        Dog d1 = new Dog("Buddy", "Golden Retriever");
        Dog d2 = new Dog("Max", "Labrador");

        // Modifying values using setter methods
        d1.setName("Rocky");
        d1.setBreed("German Shepherd");

        d2.setName("Charlie");
        d2.setBreed("Beagle");

        // Printing updated values
        d1.display();
        d2.display();
    }
}