package sectionFourLogicalPrograms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class eveOddNumber {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no ");
		
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			
			System.out.println("Given number is Even ");
			
		}
		
		else {
			
			System.out.println("Given number is Odd");
		}
		
		
	 
	}
}
