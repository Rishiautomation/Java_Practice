
public class Interface_Implement {
  interface Animal{
	  static void sound() {
		   
	   }
  }
	
	
	
	static class Dog implements Animal{
		
		public void sound() {
			System.out.println("Dog Bark");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.sound(); 
		
				
		
		
		
	}

}
