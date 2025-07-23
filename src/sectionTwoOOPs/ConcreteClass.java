package sectionTwoOOPs;

public class ConcreteClass extends Abstract {
	
//	A concrete class is essentially the implementation of the structure defined by abstract methods."
//	#Notebook 
//	Concreate class in class tha has an implementation of methods which inherited form abstract class and interface 
	
	  private double radius;

	    // Constructor
	    public ConcreteClass(double radius) {
	        this.radius = radius;
	    }

	    // Implementation of abstract method
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	    
	    
   public static void main(String[] args) {
	ConcreteClass circle = new ConcreteClass(5);
    circle.display();
    System.out.println("Area of the circle: " + circle.calculateArea());
}

}
