
public class Reverse_String2 {

	public static void main(String[] args) {
		
		String inputString="Rishikesh Singh";
		String OutputString= "";
		for(int i=inputString.length()-1;i>=0;i--) {
			OutputString=OutputString+inputString.charAt(i);
		
		}
		System.out.println(OutputString);
	}

}
