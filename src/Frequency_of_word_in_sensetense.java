import java.util.HashMap;

public class Frequency_of_word_in_sensetense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a test this is";
		 String newstr=str.toLowerCase();
		String [] str1 = newstr.split(" ");
		HashMap<String , Integer> map = new HashMap<>();
		for(int i=0; i<str1.length;i++) {
			String val = str1[i];
			if(map.containsKey(val)) {
				map.put(val, map.get(val)+1);
			}
			else {
				map.put(val, 1);
			}
		}
		for(String n : map.keySet()) {
			System.out.println(n+' '+map.get(n) );
		}

	}

}
