package sectionTwoOOPs;

public class UpDownCasting {
//	#Casting
//	In Java, casting refers to the process of converting a variable from one data type to another. Upcasting and downcasting are terms commonly used in the context of class hierarchies,
//	especially with inheritance.
	
//	#1 Primitive Casting:

//		This involves converting values between primitive data types. The two subtypes of primitive casting are:
//	1	Implicit Casting (Widening): This occurs when you assign a value of a smaller data type to a larger data type without explicit casting.
//		For example, assigning an int to a double.
//	2	Explicit Casting (Narrowing): This occurs when you manually convert a value from a larger data type to a smaller data type.
//		This requires explicit casting and may result in loss of data or precision.
	{
	 // Primitive casting
     int intValue = 42;
     double doubleValue = intValue; // Implicit casting (widening)
     System.out.println("Implicit Casting (Widening): " + doubleValue);

     doubleValue = 42.75;
     intValue = (int) doubleValue; // Explicit casting (narrowing)
     System.out.println("Explicit Casting (Narrowing): " + intValue);
	
//	#2 Reference Casting:
		
//		This involves converting between different types of objects, typically in an inheritance hierarchy. There are two subtypes of reference casting:
//	1	Upcasting (Widening): This happens implicitly when you assign an object of a subclass to a reference variable of a superclass.
//	2	Downcasting (Narrowing): This requires explicit casting and is used when you assign an object of a superclass to a reference variable of a subclass.
//		Downcasting can lead to a ClassCastException if the actual object is not an instance of the target subclass.
		
     
    class Animal {
         void eat() {
             System.out.println("Animal is eating");
         }
     }

     class Dog extends Animal {
         void bark() {
             System.out.println("Dog is barking");
         }
     }

     Animal animal = new Dog(); // Upcasting (widening)
     animal.eat();

     // Downcasting (narrowing) - Requires explicit casting
     if (animal instanceof Dog) {
         Dog dog = (Dog) animal;
         dog.bark();
     }
 }
		

}
