package ClassAndConstructor;

public class Person {

    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        // Creating objects
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 30);

        // Printing values
        System.out.println("Person 1: " + p1.name + " " + p1.age);
        System.out.println("Person 2: " + p2.name + " " + p2.age);
    }
}