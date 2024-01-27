package sectionTwoOOPs;

public class thisAndSuper {

//	this refers to the current object and is often used to differentiate between instance variables and local variables.
//	super refers to the superclass and is used to invoke superclass methods, access superclass fields, and invoke the superclass constructor.
	 int x;

	    // Constructor
	    public thisAndSuper(int x) {
	        // Using 'this' to distinguish between instance variable and parameter
	        this.x = x;
	    }

	    // Method using 'this' to invoke another method
	    public void printX() {
	        System.out.println("Value of x: " + this.x);
	    }
	   
	    public static void main(String[] args) {
			thisAndSuper thiss = new thisAndSuper(101);
				thiss.printX();
		}

}