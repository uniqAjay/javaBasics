package sectionTwoOOPs;

public class Inheritance {
	
//	Inheritance is one of the fundamental concepts in object-oriented programming (OOP) that allows a class (subclass or derived class)
//	to inherit properties and behaviors (fields and methods) from another class (superclass or base class).
//	This promotes code reuse and helps create a hierarchical structure in your code.
	
	// Base class (superclass)
	
	    String species;

	    // Constructor
	    public Inheritance(String species) {
	        this.species = species;
	    }

	    // Method
	    public void makeSound() {
	        System.out.println("Some generic sound");
	    }
	}

