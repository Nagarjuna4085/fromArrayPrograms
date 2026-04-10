package interfaces;

interface Animal {
    // Contract says the method name is bark
    void bark(); 
}

class Dog implements Animal {
    // If you write speak() here, it will throw a COMPILER ERROR
    // because it doesn't match the interface.
    
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}