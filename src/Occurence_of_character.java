import java.util.HashMap;

public class Occurence_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababcc";
		HashMap<Character , Integer> map = new HashMap<>();
		int count =0;
		
	    for(int i=0;i<str.length();i++) {
	    	char ch=str.charAt(i);
	    	if(map.containsKey(ch)) {
	    		map.put(ch, map.get(ch)+1);
	    	}
	    	else {
	    		map.put(ch, 1);
	    	}
	    }
	    for( char n:map.keySet()) {
	    	System.out.println("count is "+n+' '+map.get(n));
	    }
	
	
	}
	

	}


