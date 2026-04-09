package abstraction;

abstract class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    // Every human needs to do these, but HOW they do them varies
    public abstract void eat();
    public abstract void exercise();

    // A shared method that all children can use
    public void introduce() {
        System.out.println("Hi, my name is " + name);
    }
    
    public String identity() {
    	return "i am " + this.getClass().getSimpleName() ;
    }
    
    public static void main(String[] args) {
    	Person[] members = {
                new Athlete("LeBron", "Basketball"),
                new LazyPerson("Couch Potato Joe")
            };
    	for (Person p : members) {
            p.introduce(); // Shared behavior
            p.eat();       // Unique behavior
            p.exercise();  // Unique behavior
            System.out.println(p.identity());
            System.out.println("-----------------");
        }
	}
}

class Athlete extends Person {
    // Variable specific only to Athletes
    private String sport;

    Athlete(String name, String sport) {
        super(name);
        this.sport = sport;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a high-protein meal for " + sport + ".");
    }

    @Override
    public void exercise() {
        System.out.println(name + " is running 10 miles and lifting weights.");
    }
}

class LazyPerson extends Person {
    LazyPerson(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a large pizza and drinking soda.");
    }

    @Override
    public void exercise() {
        System.out.println(name + " is exercising by reaching for the remote control.");
    }
}