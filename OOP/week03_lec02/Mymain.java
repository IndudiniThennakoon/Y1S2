public class MyMain {
	public static void main(String[] args) {
		Receptionist r1 = new Receptionist();
		
		
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