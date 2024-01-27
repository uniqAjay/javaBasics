package sectionTwoOOPs;

public abstract class Abstract {

//  In Java, an abstract class is a class that is declared with the abstract keyword.
//	Java abstract classes cannot be instantiated on their own, and they serve as a blueprint for other classes.
//	Abstract classes may contain abstract methods (methods without a body) that must be implemented by concrete subclasses.
	
//	#Notebook
//	"An abstract class is a restricted class that cannot be used to create objects directly; instead, it must be inherited by another class."
//	+ " Objects are instantiated from the subclass rather than the abstract class itself."
	
	    // Abstract method
	    public abstract double calculateArea();

	    // Concrete method
	    public void display() {
	        System.out.println("This is a shape.");
	    }
	}


