
public class String_Swap {

	public static void main(String[] args) {
		String Str1= "Hello";
		String Str2="World";
		Str1=Str1+Str2;
		Str2=Str1.substring(0,Str1.length()-Str2.length());
		Str1=Str1.substring(Str2.length());
		System.out.println(Str1);
		System.out.println(Str2);
		
		
		//Another approach
		
//		String temp=Str1;
//		Str1=Str2;
//		Str2=temp;
//		System.out.println(Str1);
//		System.out.println(Str2);

	}

}
