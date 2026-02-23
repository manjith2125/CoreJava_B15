package Oops;

public class CarDeliveryPatner extends DeliveryPartner {
	
	public void LargeOrderSupport() {
		System.out.println("LargeOrderSupport will be Delivered by Car");
	}
	public void DeliverOrder() {
		System.out.println("Order has been delivery to coustmer by Car- delivery Patner..");
	}
	
	public static void main(String[] args) {
		
		CarDeliveryPatner cdp=new CarDeliveryPatner();
		
		cdp.acceptOrder();
		cdp.PickupOrder();
		
		cdp.LargeOrderSupport();
		cdp.DeliverOrder();
		
		
	}

}
