
public class Find_Max_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {9, 8, 7, 6,10,11};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
	}

}
