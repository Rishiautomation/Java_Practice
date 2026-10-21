
public class Count_number_of_words_inSentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I am learning Java from ChatGPT and learning java is fun";
		int count =0;
//		boolean inword = false;
//		for(int i=0; i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(ch!=' ') {
//				if(!inword) {
//					count++;
//					inword=true; //matlab hum yaha word keh andar hai jab yeh false hoga tab hum value by 1 increase kar rhe hai
//				}
//				else {
//				     inword=false;
//				}
//				
//			}
//		
//		}
		
		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==' ') {
//				count++;
//			}
//		}
//		System.out.println("count is "+ (count+1));
	
		String [] splitString =str.split(" ");
		for(int i=0;i<splitString.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
