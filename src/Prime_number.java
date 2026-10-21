import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the Number");
		int number=sc.nextInt();
		
		Boolean isPrime=true;
		
		if(number<=1) {
			isPrime=false;
		}
		else {
			
			for(int i=2;i<=Math.sqrt(number);i++) {
				 if(number%i==0) {
					 isPrime=false;
					 break;
					 
				 }
				
			}
		}

		if(isPrime) {
			System.out.println("Number is Prime "+number);
		}
		else {
			System.out.println("Numebr is not Prime "+number);
		}
		
	}

}
