package polymorphism;

// Base Class
class AnimalT {
    public void move() {
        System.out.println("The animal moves in a generic way.");
    }

    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclass 1
class Bird extends AnimalT {
    @Override
    public void move() {
        System.out.println("The bird flies through the clouds.");
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }
}

// Subclass 2
class Panthera extends AnimalT {
    @Override
    public void move() {
        System.out.println("The panthera runs gracefully and stealthily.");
    }

    @Override
    public void makeSound() {
        System.out.println("The panthera roars: Roar!");
    }
}