package Java_Core;

public class Enums {

enum OrderStatus{
	PENDING(1,"Order is in Pending Status"),
	SHIPPED(2,"Your Order is Shipped"),
	DELIVERED(3, "Order Delivered"),
	CANCELLED(4, "Order is Cancelled");
	
	private int code;
	private String Message;
	
	//constructor
	OrderStatus(int code, String Message){
		this.code=code;
		this.Message=Message;
	}
	//Getters
	public int getcode() {
		return code;
	}
	public String getMessage() {
		return Message;
	}
	//getting order status by the code method
	 public static OrderStatus fromStatuscode(int code) {
		 for(OrderStatus status :OrderStatus.values()) {
			 if(status.getcode()==code) {
				 return status;
			 }
		 }
		  throw new IllegalArgumentException("Invalid order status code: " + code);
	 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	OrderStatus status=	OrderStatus.fromStatuscode(5);
	System.out.println(status +" : "+status.getMessage());
		
		
		
	}

}
