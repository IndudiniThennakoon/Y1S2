//  Hospital managment system

class Room{
	private int roomNo;
	private boolean isAvailable;
	
	// Setters and getters for Room class
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public int getRoomNo(){
		return roomNo;
	}
	
	public boolean isAvailable(){
		return isAvailble;
	}
	
	public void setAvailble(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
}

class Receptionist{

	private string ID;
	private string name;
	private int age;
	private string address;
	private int workingHours;
	private Room room;
	
// implement the method

	// method check room availbility
	
	public boolean checkRoomavailblity(Room room){
		this.room = room;
		return room.isAvailable();
	}

	// calculate bill
	
	public double generateBill(int noOfDays, string roomType){
		double luxaryRoomRate = 2000.0;
		double normalRoomRate = 1000.0;
		
		if(roomType == "Luxury"){
			return (luxaryRoomRate * noOfDays);
		}else{
			return (normalRoomRate * noOfDays);
		}
	}

	// get customer feeback

	public String getcustomerFeedback(String feedback){
		return feedback;
		
	}
	// setters and getters
	public void setID(String ID){
		this.ID = ID;
	}
	
	public Strong getID(){
		return ID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		retrun age;
	}
	
	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
	
	public void setWorkingHours(int workingHours){
		this.workingHours = workingHours;
	}
	
	public int getWorkingHours(){
		return workingHours;
	}	
}

public class Ex01{

	public static void main(String[] args){
		
	}
}