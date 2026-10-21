
public class Longest_Conseutive_integer_array {

	public static void main(String[] args) {
		
		int array[]= {4,5,6,7,10,11,12};
		 int count=0;
		 
		 int Max=0;
		 
		 for(int i=0;i<array.length-1;i++) {
			 
			 if(array[i]+1==array[i+1]) {
				 count++;
			 }else {
				 count=0;
			 }
			 Max=Math.max(0, count+1);
		 }
		
		 System.out.println(Max);
		 
	}


}
