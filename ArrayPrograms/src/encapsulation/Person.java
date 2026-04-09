package encapsulation;


public class Person {
    // Private variables (The "Hiding" part of Encapsulation)
    private String name;
    private int age;
    private String country;

    // Constructor (The "Create" operation)
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // GETTERS (The "Read" operations)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }

    // SETTERS (The "Update" operations with validation)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Encapsulation allows us to add "Guard Rails"
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25, "USA");
        
        // Indirectly updating (Update)
        p1.setAge(26);
        
        // Indirectly accessing (Read)
        System.out.println(p1.getName() + " is " + p1.getAge());
    }
}