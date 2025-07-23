package sectionOneBasicsJava;

public class controlStatement {
  public static void main(String[] args) {
	

//		In Java, control statements are used to control the flow of execution in a program.
//		These statements enable you to make decisions and execute code based on certain conditions.
//		Here are the main types of control statements in Java:

//		Selection Statements:
//		
	  			int number = 10;

		        // If statement
		        if (number > 0) {
		            System.out.println("The number is positive.");
		        }

		        // If-else statement
		        if (number % 2 == 0) {
		            System.out.println("The number is even.");
		        } else {
		            System.out.println("The number is odd.");
		        }

		        // If-else if-else statement
		        if (number > 0) {
		            System.out.println("The number is positive.");
		        } else if (number < 0) {
		            System.out.println("The number is negative.");
		        } else {
		            System.out.println("The number is zero.");
		        }
		        
//		        sitchCase
//		        In Java, the switch statement is another way to make decisions based on the value of an expression.
//		        It provides a concise way to handle multiple possible values of a variable
		        
		        int dayOfWeek = 3;

		        switch (dayOfWeek) {
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		            default:
		                System.out.println("Invalid day of the week");
		        }
		    }
  
  
}






