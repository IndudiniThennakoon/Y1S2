//  Hospital managment system

public class Ex01{

	public static void main(String[] args){
		// create object

		Receptionist receptionist = new Receptionist();
		Room room = new Room();
		
		room.setRoomNo(10);
		// room.setAvailable(true);
		
		receptionist.checkRoomavailablity(room);
		
		System.out.println("Your Bill is: " + receptionist.generateBill(20,"luxury"));
	}
}