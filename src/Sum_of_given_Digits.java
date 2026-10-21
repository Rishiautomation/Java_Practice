import java.util.Scanner;

public class Sum_of_given_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter an integer: ");
		int n= sc.nextInt();
		sc.close();
		int sum=0;
		if(n<10) {
			System.out.println("Please enter valid number");
			return;
			
		}
		
		else {	while(n!=0) {
			int digit= n%10;
			sum=sum+digit;
			n=n/10;
		}}
System.out.println(sum);
	}

}
