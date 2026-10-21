import java.util.Arrays;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr[]= {"apple","cat","apple","dog","cat"};
	findDuplicate(arr);
	System.out.println(Arrays.toString(arr));
	
	
	}
	static void findDuplicate(String Val[]) {
		for(int i=0;i<Val.length;i++) {
			for(int j=i+1;j<Val.length;j++) {
				if(Val[i]==Val[j]) {
					System.out.println("Duplicate Found "+ Val[i]);
					break;
					
				}
			}
		}
		
	}

}
