
public class Duplicate_array_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[]= {1,2,4,5,2,4,5};
		duplicateint(arr);
		
		
		
		
		
	}
  static void duplicateint(int Val[]) {
	  for(int i =0;i<Val.length;i++) {
		  for(int j=i+1;j<Val.length;j++) {
			  if(Val[i]==Val[j]) {
				  System.out.println("Duplicate Value "+Val[i]);
				  break;
			  }
		  }
	  }
  }
}
