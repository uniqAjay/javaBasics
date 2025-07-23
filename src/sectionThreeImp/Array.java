package sectionThreeImp;

public class Array {
	
//	An array in Java is a data structure that allows you to store a fixed-size sequential collection of elements which has he same data type.
//	Each element in the array is identified by an index or a key
	
	    public static void main(String[] args) {
	        // Declaration and initialization of an integer array
	        int[] numbers = new int[5];

	        // Assigning values to array elements
	        numbers[0] = 10;
	        numbers[1] = 20;
	        numbers[2] = 30;
	        numbers[3] = 40;
	        numbers[4] = 50;

	        // Accessing and printing array length (property of the object)
	        System.out.println("Array length: " + numbers.length);
	       
	        // Using toString() method inherited from Object class
	        System.out.println("Array as a string: " + numbers.toString());

	        // Creating another reference to the same array object
	        int[] anotherArray = numbers;

	        // Modifying the array through the new reference
	        anotherArray[1] = 25;

	        // Printing the modified array using the original reference
	        System.out.println("Modified array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }
	    }
	}

	


