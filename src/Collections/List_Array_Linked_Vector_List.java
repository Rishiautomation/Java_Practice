package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Array_Linked_Vector_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>li=new ArrayList<>();
		li.add(2);
		li.add(3);
		li.add(2);//duplicate allowed 
		li.add(5);
		li.add(6);
		
		for(int digit:li) {
			System.out.println(digit);
		}
		List<String> linked=new LinkedList<>();
		linked.add("Rishkesh");
		linked.add("Rishkesh");
		linked.add("Rishkesh");
		
		linked.add("Rishkesh");
		
		List<Integer> VE=new Vector<>();
		VE.add(2);
		VE.add(2);
        
	
	
	}

}
