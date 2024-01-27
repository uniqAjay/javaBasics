package sectionTwoOOPs;

//Derived class (subclass)

public class InheritancExample extends Inheritance {
		    String breed;

		    // Constructor
		    public InheritancExample(String species, String breed) {
		        // Call the superclass constructor using super()
		        super(species);
		        this.breed = breed;
		    }

		    // Method overriding
		    @Override
		    public void makeSound() {
		        System.out.println("Woof! Woof!");
		    }

		    // Additional method specific to Dog
		    public void fetch() {
		        System.out.println("Fetching the ball!");
		    }
		 
		    public static void main(String[] args) {
		    	// Creating an instance of the subclass (Dog)
		    	InheritancExample myDog = new InheritancExample("Canine", "Labrador");

		        // Accessing fields from the superclass
		        System.out.println("Species: " + myDog.species);
		        System.out.println("Breed: " + myDog.breed);

		        // Invoking methods
		        myDog.makeSound();  // Calls overridden method in Dog class
		        myDog.fetch();      // Calls method specific to Dog class

			}
		}


