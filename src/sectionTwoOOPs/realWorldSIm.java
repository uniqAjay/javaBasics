package sectionTwoOOPs;

public class realWorldSIm implements GeneralizationSim{
	
	@Override
	public void dataPlan() {
		System.out.println("its real world bro");
	}

	@Override
	public void monthlyCalls() {
		System.out.println("dont make call brooo, Welcome to real world");
		
		
	}
	@Override
	public void monthlyPlan() {
		
		System.out.println("I don't know what are you doing with you life, broo wakee upp");
	}

	public static void main(String[] args) {
		realWorldSIm realworld = new realWorldSIm();
		realworld.dataPlan();
		realworld.monthlyCalls();
		realworld.monthlyPlan ();
	}

}
