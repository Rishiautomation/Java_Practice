
public class Reverse_String {

	public static void main(String[] args) {
		String sc="Java is awesome";
		String reverse="";
		for(int i=sc.length()-1;i>=0;i--) {
			reverse+=sc.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
