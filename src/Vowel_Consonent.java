
public class Vowel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Java Programming";
		String str1=str.toLowerCase();
		String vowel = "aeiou";
		int vol =0;
		int consonent =0;
		
		
		for(int i =0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			Boolean isvowel = false;
			if(ch >='a'&& ch<='z') {
				for(int j=0;j<vowel.length();j++) {
					if(ch ==vowel.charAt(j)) {
						isvowel = true;
						break;
					}
				}
			}
			if(isvowel) {
				vol++;
			}
			else {
				consonent++;
			}
			
		}
		System.out.println("Vowels: " + vol + " | Consonants: " + consonent);
	}

}
