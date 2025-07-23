package sectionFourLogicalPrograms;

public class whiteSpaceInString {

	public static void main(String[] args) {
		
			
		String str = " a b c de ";
		int count = 0;
		
		
		for (int i = 0; i < str.length()-1; i++) {
			
			 char str1 = str.charAt(i);
			 
			 if(str1 == ' ') {
				 
				 count++;
			 }
		
		}
		
		System.out.println("Number of White space is " + count);
	}
	
}
