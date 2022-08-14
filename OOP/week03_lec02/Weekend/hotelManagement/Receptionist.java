public class Receptionist {
	private int  id;
	private String name;
	private double salary;
	
	//	default constructor
	public Receptionist() {
		//  it's not mandatory to add the variables it will be automatically added
	}

	//	overloaded constructor 
	
	// public Receptionist(int pid, String pname, double psalary){
	// 	id = pid;
	// 	name = pname;
	// 	salary = psalary;
		
	// }

	//	overloaded constructor - way2 

	public Receptionist(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	//	overloaded constructor - way3 

	// public Receptionist(int id, String name, double salary){
	// 	this.id = id;
	// 	this.name = name;
		
		
	// }
	
	public  boolean checkRoomAvailability( int roomNo) {
		return true;
	}
	
	public double genereateBill() {
		return 0.0;
		
	}
	
	public void takeCustomerFeedback() {
		
	}

	//	 getter (accessor) for id  
	public int getId() {
		return id;
	}
// setter (mutator) for id
	public void setId(int id) {
		this.id = id;
	}
//	 getter (accessor) for name  
	public String getName() {
		return name;
	}
	// setter (mutator) for name
	public void setName(String name) {
		this.name = name;
	}
//	 getter (accessor) for salary  
	public double getSalary() {
		return salary;
	}
	// setter (mutator) for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
} 