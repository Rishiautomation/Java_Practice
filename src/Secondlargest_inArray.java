
public class Secondlargest_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,56,100,99,212};
//		int max = arr[0];
//
//		// First loop: Find the max element
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//
//		// Second loop: Find the second max (which is not equal to max)
//		int secondMax = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != max && arr[i] > secondMax) {
//				secondMax = arr[i];
//			}
//		}
//
//		System.out.println("Second largest: " + secondMax);
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("second largest is " + arr[1]);
	}

}
