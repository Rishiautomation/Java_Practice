
public class count_alphabet_digit_specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="Hello123@#!";
		int alpha =0;
		int num = 0;
		int special =0;
		for(int i = 0;i<input.length();i++) {                   
			char ch=input.charAt(i);                    
			if(Character.isLetter(ch)) {
				
				alpha++;
			}
			else if(Character.isDigit(ch)) {
				num++;
			}
			else {
				special++;
			}
		}
		System.out.println("Alpahbet "+ alpha+ "Number "+num+ "Special "+ special );
		
		
		
		
	}

}
