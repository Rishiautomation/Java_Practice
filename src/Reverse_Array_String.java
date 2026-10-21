import java.util.Arrays;

public class Reverse_Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   String sc[]= {"Rishikesh","Apple","Singh","Maharashtra"};
		   
		ReverseArray(sc);
		System.out.println("Arrays "+Arrays.toString(sc));
		
		
	}
	//reverse everything
   static void ReverseArray(String Arr[]) {
		int n=Arr.length;
		for(int i=0;i<n/2;i++) {
			String temp=Arr[i];
			Arr[i]=Arr[n-i-1];  ///reversing the whole array
			Arr[n-i-1]=temp;
		}
		for(int k=0;k<n;k++) {
			String reverse="";
			String original=Arr[k];                //reversing the single-single element
			for(int m=original.length()-1;m>=0;m--) {
				reverse+=original.charAt(m);
			}
			Arr[k]=reverse;
		}
		
		
	}
}

