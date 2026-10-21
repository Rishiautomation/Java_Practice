import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Java_prac_2 {
	
public static void main(String[] args) {
	 List<String> names = Arrays.asList("Ravi", "Aman", "Ankit", "Rishikesh", "Suresh", "Mahesh");

     System.out.println("Using Normal Stream:");
     names.stream().forEach(name -> {
         System.out.println(Thread.currentThread().getName() + " - " + name);
     });

     System.out.println("\nUsing Parallel Stream:");
     names.parallelStream().forEach(name -> {
         System.out.println(Thread.currentThread().getName() + " - " + name);
     });
	
	
	
}

}
