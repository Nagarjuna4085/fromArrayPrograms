package polymorphism;

// 1. The General Category (The "Remote Control" or "Mask")
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// 2. Specific Type
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }
}

// 3. Specific Type
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}