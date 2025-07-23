package sectionFourLogicalPrograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 1000; i++) {
			int ArmNum = i;
			int sum = 0;
			
			int digits = 0;
			int temp = i;
			while (temp != 0) {
				digits++;
				temp /= 10;
			}
			
			temp = i;
			while (temp != 0) {
				int rem = temp % 10;
				sum += Math.pow(rem, digits);
				temp /= 10;
			}
			
			if (ArmNum == sum ) {
				System.out.println("Given number " + ArmNum + " is Armstrong");
			} else {
				System.out.println("Given number " + ArmNum + " is not Armstrong");
			}
		}
	}
}

