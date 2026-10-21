import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="silent";
		String str2 ="listen";
		
		if(str1.length()!= str1.length()) {
		     System.out.println("Given String is not anagram");
		     return;
		}
		   //convert string to arrays 
		   char[] arr1 =str1.toCharArray();
		   char[] arr2 =str2.toCharArray();
		
		// Use Java's inbuilt sort method
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		Boolean isAnagram=Arrays.equals(arr1, arr2);
		if(isAnagram) {
			System.out.println("Given String is Anagram");
		}
		else {
			System.out.println("Given String is not Anagram");
		}
		
	}
		

	}


