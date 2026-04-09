package abstraction;

abstract class Bird {
    protected String name;

    // Even in abstract classes, constructors are used to initialize parent data
    Bird(String name) {
        this.name = name;
    }

    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird {
    Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " (Eagle) soars at high altitudes using thermal currents.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (Eagle) emits a high-pitched whistling scream.");
    }
}

class Hawk extends Bird {
    Hawk(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " (Hawk) flaps its wings rapidly and dives quickly.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (Hawk) makes a piercing 'kee-eeeee-arr' cry.");
    }
}