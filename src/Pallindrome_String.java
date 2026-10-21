
public class Pallindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String str2 = "";
		Boolean isPallindrome = true;
	    for(int i =str.length()-1;i>=0;i--) {
	    	str2+=str.charAt(i);
	    	
	    }
	    for(int j=0;j<str.length();j++) {
    		if(str.charAt(j)!= str2.charAt(j)) {
    			isPallindrome = false;
    			break;
    		}
    		
    	}
	   
	
     
		 if(isPallindrome) {
			 System.out.println("String is pallindrome");
		 }
		 else {
			 System.out.println("Not Pallindrome");
		 }
		 
	}

}
