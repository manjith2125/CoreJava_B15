package Oops;

public class CycleDeliveyPatner extends DeliveryPartner {
	
	public void Ecofriendly() {
		System.out.println("Ecofriendly order will be delivered ..");
	}
	@Override
	public void DeliverOrder() {
		System.out.println("Order has been delivery to coustmer by Car delivery Patner..");
	}
	
	public static void main(String[] args) {
		
		CycleDeliveyPatner cdp=new CycleDeliveyPatner();
		cdp.acceptOrder();
		cdp.PickupOrder();
		cdp.Ecofriendly();
		cdp.DeliverOrder();
		
	}

}
