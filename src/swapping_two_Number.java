import java.util.Scanner;

public class swapping_two_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Given integer are "+num1+" "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Inter Num1 "+num1);
		System.out.println("Integer Num2 "+ num2);
	}

}
