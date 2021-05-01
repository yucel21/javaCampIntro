package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer yucel = new IndividualCustomer();
		yucel.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiburada);
		//customerManager.add(yucel);
		
		Customer[] customers = {hepsiBurada, yucel};
		
		customerManager.addMultiple(customers);
		
	}

}
