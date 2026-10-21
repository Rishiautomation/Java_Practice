package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mp= new HashMap<>();
		mp.put(1, "Rishikesh");
		mp.put(2, "Singh");
		

        for (Integer key : mp.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mp.get(key)); // ✅ Fixed formatting
        }
		
	}

}
