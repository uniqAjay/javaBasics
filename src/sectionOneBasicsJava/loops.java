package sectionOneBasicsJava;

public class loops {
	
	//In Java, loops are used to repeatedly execute a block of code until a certain condition is met.
	//There are three main types of loops in Java: for, while, and do-while.
	
	public static void main(String[] args) {
//		1. for Loop:
//		   The for loop is used when you know how many times you want to execute a block of code.
		// Example: Print numbers from 1 to 5 using a for loop
		for (int i = 1; i <= 5; i++) {
		    System.out.println(i);
		}
		
		
//		2. while Loop:
//		   The while loop is used when the number of iterations is not known beforehand and depends on a condition.
		// Example: Print numbers from 1 to 5 using a while loop
		
		int i = 1;
		while (i <= 5) {
		    System.out.println(i);
		    i++;
		}

//		3. do-while Loop:
//		   The do-while loop is similar to the while loop, but it guarantees that the block of code inside the loop is executed at least once.
		
		// Example: Print numbers from 1 to 5 using a do-while loop
		int j = 1;
		do {
		    System.out.println(j);
		    j++;
		} while (j <= 5);

//		4. Enhanced for-each Loop:
//		   The enhanced for loop simplifies the process of iterating through arrays or collections.
		// Example: Print elements of an array using an enhanced for loop
		int[] numbers = {1, 2, 3, 4, 5};
		for (int number : numbers) {
		    System.out.println(number);
		}



	

	

}

}