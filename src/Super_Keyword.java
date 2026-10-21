
public class Super_Keyword {

	static class Parent {
		String message = "Message from parent";

		Parent() {
			System.out.println("Parent constructor called");

		}

		void displayMessage() {

			System.out.println("Parent method" + message);

		}

	}

	static class Child extends Parent {
		String message = "In a child method";

		Child() {

			super();
			System.out.println("child Constructor");

		}

		@Override

		void displayMessage() {
			super.displayMessage();
			System.out.println("Child Method " + message);
		}

		void showParentMessage() {
			System.out.println("Displaying parent message " + super.message);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		child.displayMessage();
		child.showParentMessage();
		
	
		
	}

}
