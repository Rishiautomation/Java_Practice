import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5};
		reversearray(array);
		
		System.out.println("Reverse Array"+ Arrays.toString(array));
		
	}
	
	
public static void reversearray(int[]arry) {
	
	int start=0;
	int end=arry.length-1;
	while(start<end) {
		int temp=arry[start];
		arry[start]=arry[end];
		arry[end]=temp;
		
		start++;
		end--;
	
	}
	
	
}
}

//another approach to solve same problem 
//public static void reversearray(int[] arry) {
//    int n = arry.length;
//    
//    // Using a for loop to swap elements
//    for (int i = 0; i < n / 2; i++) {
//        int temp = arry[i];
//        arry[i] = arry[n - i - 1];
//        arry[n - i - 1] = temp;
//    }
