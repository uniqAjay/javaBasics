package sectionFourLogicalPrograms;

public class findVowels {
	public static void findVowelsAndConso(String str) {
		String vowels = "aeiouAEIOU";
		String [] splitedString = str.split("");
		int vowelCount = 0;
		int consonentCount = 0;
		
		for(String ch : splitedString) {
			if(Character.isLetter(ch.charAt(0))) {
				if(vowels.contains(ch)) {
					vowelCount++;
				}
				else consonentCount++;
			}
			
		}
		
		System.out.println("Vowel count is " + vowelCount);
		System.out.println("Consonent count is " + consonentCount);
	}
		public static void main(String[] args) {
			findVowelsAndConso("superMan");
		}
}
