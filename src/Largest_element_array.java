
public class Largest_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2, 5, 9, 1, 7, 6};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
        System.out.println("Maximum : "+ max);
	}

}
