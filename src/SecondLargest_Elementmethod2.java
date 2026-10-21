import java.util.HashMap;

public class SecondLargest_Elementmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 2, 9, 3, 8, 1};
		
	   
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	    System.out.println("second largest number "+arr[1]);
	    }
		
		  
	
	}


