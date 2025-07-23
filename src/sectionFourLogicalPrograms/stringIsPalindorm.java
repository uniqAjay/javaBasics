package sectionFourLogicalPrograms;

public class stringIsPalindorm {
	
	public static void isPalindorm(String str){
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(right) != str.charAt(left)) {
				System.out.println("string is not palindrom");
				return;
			}
			
			left++;
			right--;
		}
		
		System.out.println("String is palindorm");
		 
	
	}
		public static void main(String[] args) {
			isPalindorm("Hello");
		}
}
