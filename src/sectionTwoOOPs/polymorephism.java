package sectionTwoOOPs;

public class polymorephism {
	
//	Polymorphism allows objects of different types to be treated as objects of a common type.
//	This enables code to be more flexible and extensible.


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

