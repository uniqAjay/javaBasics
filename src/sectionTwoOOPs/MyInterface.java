package sectionTwoOOPs;

public interface MyInterface {

// In Java, an interface is a collection of abstract methods (methods without a body) that a class can choose to implement.
//interface can declare abstract methods, provide default implementations for some methods, and use private methods for internal organization.

	// Define an interface named MyInterface
	
	    // Abstract method declaration
	    void myMethod();

	    // Another abstract method
	    int calculate(int a, int b);

	    // Default method with a default implementation
	    default void defaultMethod() {
	        System.out.println("Default implementation of defaultMethod");
	    }
	}
	
