public class Receptionist {
	private int  id;
	private String name;
	private double salary;
	
	//	default constructor
	public Receptionist() {
		//  it's not mandatory to add the variables it will be automatically added
	}

	//	overloaded constructor 
	
	public Receptionist(int pid, String pname, double psalary){
		id = pid;
		name = pname;
		salary = psalary;
		
	}
	
	public  boolean checkRoomAvailability( int roomNo) {
		return true;
	}
	
	public double genereateBill() {
		return 0.0;
		
	}
	
	public void takeCustomerFeedback() {
		
	}

	
	
	
	
	
	
} 