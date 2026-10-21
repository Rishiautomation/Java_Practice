
public class Reverse_eachword_sentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="I am a Automation Tester";
	    String [] arr =word.split(" ");
		for(int i=0;i<arr.length;i++) {
			String one = arr[i];
		    String rev =" ";
		    for(int j=one.length()-1;j>=0;j--) {
		    	rev = rev+one.charAt(j);
		    	
		    }
		    
		    System.out.print(rev);
			}
		}

	}


