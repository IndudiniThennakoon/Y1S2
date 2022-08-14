public class MyMain {
	public static void main(String[] args) {
		Receptionist r1 = new Receptionist();
		
		// Receptionist r2 = new Receptionist(56, "Indu" , 25000.00);
		//  this r2 object is refering to overload constructor
		Receptionist r3 = new Receptionist(5, "Induuuu" , 250000.00);
		//  this r3 object is refering to overload constructor
		boolean res = r1.checkRoomAvailability(45);
		if (res == true) {
			System.out.println("Room is available");
		}else {
			System.out.print("Room is Not available");
		}
		
		double bill = r1.genereateBill();
		System.out.println("Total bill is" + bill);
		
		r1.takeCustomerFeedback();
	}