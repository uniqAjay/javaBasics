package sectionFourPatternprog;

public class printHexagon {
	 public static void main(String[] args) {
	        int size = 5; // Adjust the size of the hexagon as needed

	        printHexagon(size);
	    }

	    static void printHexagon(int size) {
	        for (int i = 1; i <= size; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= size - i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks for the left side
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	        for (int i = size - 1; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = 1; j <= size - i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks for the right side
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}



