package Oops;

public class BikeDeliveryPatner extends DeliveryPartner {
	
	public void WearHelimet() {
		System.out.println("Delivery Patner wear Helimet..");
	}
	
	public void DeliverOrder() {
		System.out.println("Order has been delivery to coustmer by Bike delivery Patner..");
	}
	
	public static void main(String[] args) {
		
		BikeDeliveryPatner bdp=new BikeDeliveryPatner();
		
		bdp.acceptOrder();
		bdp.PickupOrder();
		bdp.WearHelimet();
		bdp.DeliverOrder();
		
	
		
	}

}
