package sectionFourLogicalPrograms;


public class reverseString {

	
	public static void main(String[] args) {
		
		String orignal = "RealWorld";
		String reverse = "";
		
		for (int i = orignal.length()-1; i>=0; i--)
		{
			
			reverse = reverse + orignal.charAt(i);
			
		}
		

		System.out.println(orignal);
		System.out.println(reverse);
		
	
	}
}
