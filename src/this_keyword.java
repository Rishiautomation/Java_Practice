
public class this_keyword {

	static class car{
		
		String model;
		int year;
		
		car(String model,int year){
			
			this.model=model;
			this.year=year;
		}
		void displayDetails() {
			System.out.println("Car Model: "+this.model);
			System.out.println("Car Year: "+this.year);
			
		}
		car(String model){
			this(model,2020);
		}
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	car c = new car("Toyota",2022);
	
	c.displayDetails();
	
	car c1 = new car("Honda");
	c1.displayDetails();
	
	}

}
