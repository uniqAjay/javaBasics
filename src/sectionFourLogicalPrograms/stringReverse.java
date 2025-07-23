package sectionFourLogicalPrograms;

public class stringReverse {
//	caseOne - ih ereht 
//	caseTwo - ereht ih 
//	caseThree - there hi 
	
	public static String caseOne(String word) {
	 String [] words = word.split(" ");
	 String finalString = "";
	 
	 for(String str : words) {
		 String revese = "";
		 for(int i = str.length()-1; i >= 0 ; i--) {
			 revese += str.charAt(i);
		 }
		 finalString += revese + " ";
	 }  
	 	return finalString.trim();
	
	}
     
    public static String caseTwo(String word) {
    	String finalString = " ";
    		for(int i =  word.length()-1 ; i >= 0; i--) {
    			finalString += word.charAt(i);
    		}
    	  return finalString.trim();
    	
    	
    }
    
    public static String caseThree(String word) {
    	String finalString="";
    	String [] words = word.split(" ");
    	for(int i = words.length-1; i >= 0; i--) {
    		finalString +=  words[i]+" ";
    	}
    	
    	return finalString.trim();
    }
    
	public static void main(String[] args) {
		System.out.println(caseOne("hi there"));
		System.out.println(caseTwo("hi there"));
		System.out.println(caseThree("hi there"));
	}
}
