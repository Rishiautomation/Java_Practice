import java.util.Scanner;

public class FIbonaaci_Series {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int first=0;
		int second=1;
		
		System.out.print("fibonaaci series "+first+" "+second+" ");
		
		for(int i=3;i<=n;i++) {
			int next=first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
		}
				

	}

}
