package sectionOneBasicsJava;

public class cunstructor {
	
//In Java, a constructor is a special type of method that is used to initialize objects.
//Constructors have the same name as the class they belong to and do not have a return type
//not even void. They are called automatically when an object is created using the new keyword.

	    // Constructor
	    public cunstructor() {
	        // Initialization code goes here
	        System.out.println("Constructor called. Object created!");
	    }

	    public static void main(String[] args) {
	        // Creating an object of MyClass automatically calls the constructor
	    	cunstructor myObject = new cunstructor();
	    }
	}


