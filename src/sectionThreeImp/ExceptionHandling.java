package sectionThreeImp;

import java.util.Scanner;

public class ExceptionHandling {
//	Exception handling in Java is a mechanism to deal with runtime errors or exceptional situations that may occur during the execution of a program.
//	Exceptions can be caused by various factors such as incorrect user input, network issues, file I/O problems, and so on.
//	Java provides a robust exception handling framework to gracefully manage these situations.
	
//	1 Try: The try block contains the code where an exception might occur. It is followed by one or more catch blocks.
	
//	2 Catch: Each catch block handles a specific type of exception that might be thrown within the corresponding try block.
//	  Multiple catch blocks can be used to handle different types of exceptions.
	
//	3 Finally: The finally block contains code that will always be executed, regardless of whether an exception occurred or not.
//	  It is optional but useful for cleanup tasks (closing resources, releasing locks, etc.).

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            int result = 10 / number; // Potential division by zero exception

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close resources, if any
            scanner.close();
        }
    }
}
