package sectionTwoOOPs;

public class Interfaceimp implements MyInterface {
	
	// Implementation of the abstract method myMethod
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }

    // Implementation of the abstract method calculate
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    // The default method is not overridden, but it can be if needed
    
    public static void main(String[] args) {
		Interfaceimp inter = new Interfaceimp();
		System.out.println(inter.calculate(23, 23));
		inter.myMethod();
		inter.defaultMethod();
    }

}
