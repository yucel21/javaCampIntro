package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer yucel = new Customer(1,"Yucel","Taskiran");
		
		customerManager.add(yucel);

	}
}
