import java.util.HashMap;

public class Count_each_word_in_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Once time once we will do";
		String lowercase=str.toLowerCase();
	    char [] singlechar=lowercase.toCharArray();
		                                                                                 // String [] singlechar=  lowercase.split(" ");  //when to count the each repetative word 
	     HashMap<Character, Integer>map=new HashMap<>();
	     for(int i=0;i<singlechar.length;i++) {
	    	 char val= singlechar[i];
	    	 if(val==' ') {
	    		 continue;
	    	 }
	    	 if(map.containsKey(val)) {
	    		 map.put(val, map.get(val)+1);
	    	 }
	    	 else {
	    		 map.put(val, 1);
	    	 }
	     }
	     for(char n:map.keySet()) {
	    	 System.out.println("count of word "+ n+ ' '+map.get(n));
	     }
	     

	}

}
