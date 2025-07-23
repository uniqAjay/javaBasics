package sectionFourLogicalPrograms;

public class secondLargestNum {

public static void findSecondLargestNum() {
	int [] nums = {1,3,4,5,21,9,7,8};	
	int largeNum = 0;
	int secondLarge = 0;
	
	for(int num: nums) {
		if(largeNum < num) {
			secondLarge = largeNum;
			largeNum = num;
		}else if (num > secondLarge && num != largeNum){
			secondLarge = num;
		}
	}
	
	System.out.println("Largest Number is "+largeNum);
	System.out.println("Second Largest Number is "+secondLarge);
} 

public static void main(String[] args) {
	findSecondLargestNum();
}

}
