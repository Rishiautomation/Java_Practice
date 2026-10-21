
public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=28;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
			System.out.println(sum);
		}
		
		if(num==sum) {
			System.out.println("number is perfect: "+num);
		}
		else {
			System.out.println("Number is not perfect");
		}

	}

}
