package sectionThreeImp;

public class StringClass {
//	In java strings are object that allows to store sequence of character which may contains alpha numeric values enclosed in double quote
//	Strings are immutable in java, it contains method that can perform certain actions on strings

	    public static void main(String[] args) {
	        // Creating a string
	        String str = "Hello, World!";

	        // Method: length() - Returns the length of the string
	        int length = str.length();
	        System.out.println("Length of the string: " + length);

	        // Method: charAt(int index) - Returns the character at the specified index
	        char firstChar = str.charAt(0);
	        System.out.println("First character: " + firstChar);

	        // Method: substring(int beginIndex) - Returns a substring from the specified index to the end
	        String substring1 = str.substring(7);
	        System.out.println("Substring from index 7: " + substring1);

	        // Method: substring(int beginIndex, int endIndex) - Returns a substring within the specified range
	        String substring2 = str.substring(7, 12);
	        System.out.println("Substring from index 7 to 12: " + substring2);

	        // Method: concat(String str) - Concatenates the specified string to the end of this string
	        String concatString = str.concat(" Welcome!");
	        System.out.println("Concatenated string: " + concatString);

	        // Method: equals(Object another) - Compares this string to another string
	        boolean isEqual = str.equals("Hello, World!");
	        System.out.println("Are equal: " + isEqual);

	        // Method: toUpperCase() - Converts the string to uppercase
	        String upperCaseStr = str.toUpperCase();
	        System.out.println("Uppercase string: " + upperCaseStr);

	        // Method: toLowerCase() - Converts the string to lowercase
	        String lowerCaseStr = str.toLowerCase();
	        System.out.println("Lowercase string: " + lowerCaseStr);

	        // Method: indexOf(String str) - Returns the index within this string of the first occurrence of the specified substring
	        int indexOfWorld = str.indexOf("World");
	        System.out.println("Index of 'World': " + indexOfWorld);

	        // Method: contains(CharSequence sequence) - Returns true if this string contains the specified sequence of characters
	        boolean containsHello = str.contains("Hello");
	        System.out.println("Contains 'Hello': " + containsHello);

	        // Method: replace(char oldChar, char newChar) - Replaces all occurrences of the specified char with another char
	        String replacedString = str.replace('l', 'z');
	        System.out.println("String after replacement: " + replacedString);
	        
	    }
	}



