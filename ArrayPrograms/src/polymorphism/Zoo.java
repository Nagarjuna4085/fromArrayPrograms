package polymorphism;

public class Zoo {
	public static void main(String[] args) {
		// UPCASTING: We use an Animal variable to hold a Cat and a Bird
        Animal myPet1 = new Cat(); 
        Animal myPet2 = new Bird();
        
        //normal
        Bird myPet3 = new Bird();
//        System.out.println(myPet1.makeSound());
        myPet2.makeSound();
        myPet3.makeSound();
        
        Animal[] zoo = {myPet1, myPet2, new Cat()};
        for (Animal a : zoo) {
            // We call the 'Animal' method...
            // BUT Java looks 'under the mask' and plays the Cat/Bird sound!
            a.makeSound(); 
        }
        
//        myPet1.makeSound();
      
        
	}

}
