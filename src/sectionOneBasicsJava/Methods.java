package sectionOneBasicsJava;

public class Methods {
	String make; 
    String model;
    int year;

    // Constructor
    public Methods(String make, String model, int year) { 
        this.make = make;
        this.model = model;
        this.year = year;
       
        
    }

    // Method
    public void start() {
        System.out.println("car information: "+make+" " +model+" " +year );
        
    }
    
    public static void main(String[] args) {
    	// Creating objects of the Car class
    	Methods car = new Methods("Toyota", "Camry", 2022);
    	Methods MyCar = new Methods("Honda", "Accord", 2021);
    	car.start();
    	MyCar.start();
    	

    }
    
}
