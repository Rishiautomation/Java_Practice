import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Java_prac {
	
	
	public static void main(String[] args) {
 //count the word in sentence "Once time once we will do ";
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
