package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert -- çoklu eklemek
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
