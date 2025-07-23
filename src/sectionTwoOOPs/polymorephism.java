package sectionTwoOOPs;

public class polymorephism {
//	Polymorphism in Java allows the same method to perform different behaviors depending on the context
//  it helps with flexibility and clean code, especially in inheritance and interfaces.

	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method to concatenate two strings
	    public String add(String a, String b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	polymorephism calculator = new polymorephism();
	        System.out.println(calculator.add(1, 2));            // Calls the first add method
	        System.out.println(calculator.add(1, 2, 3));         // Calls the second add method
	        System.out.println(calculator.add("Hello, ", "World!"));  // Calls the third add method
	    }
	}


//Compile-time

//Happens before the program runs.
//The Java compiler checks for errors.
//Example: syntax errors, method overloading.



//Run-time

//Happens when the program runs.
//Java figures out the correct method/object behavior during execution.
//Example: method overriding, exceptions.