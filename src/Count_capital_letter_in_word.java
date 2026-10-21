
public class Count_capital_letter_in_word {

	public static void main(String[] args) {
		String Given="RishiKEsh";
		
    
		
		System.out.println(CountString(Given));
		
	}

	public static int CountString(String value) {
		
		int count=0;
		for(int i=0; i<value.length();i++) {
			if(value.charAt(i)>='A' && value.charAt(i)<='Z') {
				count++;
			}
				
			
		}
		return count;
	}
}

//More advance method to count capital and small letter 
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Java_prac {
//	
//	// count the capital letter in the string 
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	 
//	String Given= "RISikesh Singh";
//	
//	int[] result = CountString(Given);
//		System.out.println("Uppercase Letters: " + result[0]);
//	    System.out.println("Lowercase Letters: " + result[1]);
//		
//		
//	}
//	public static int[] CountString(String value) {
//		
//		int count=0;
//		int j=0;
//		for(int i=0;i<value.length();i++) {
//			if(value.charAt(i)>='A'&& value.charAt(i)<='Z') {
//				count++;
//			}
//			if(value.charAt(i)>='a'&& value.charAt(i)<='z') {
//				j++;
//			}
//		}
//		return new int[] {count,j};
//	
//		
		







