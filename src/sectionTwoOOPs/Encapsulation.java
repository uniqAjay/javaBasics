package sectionTwoOOPs;

public class Encapsulation {

//	Encapsulation in java is mechanism to wrap up variable and methods together into single unit called class
//	It is the process of hiding information details and behavior of the object
	// Private variables (encapsulated)
    private String model;
    private int year;

    // Public methods to access and modify the variables
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public static void main(String[] args) {
    	// Create a Car object
    	Encapsulation myCar = new Encapsulation();

        // Set the model and year using the setter methods
        myCar.setModel("Toyota Camry");
        myCar.setYear(2022);

        // Retrieve and print the values using the getter methods
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
    }
	}

