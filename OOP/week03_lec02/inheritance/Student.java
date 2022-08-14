public class Student extends Person {
	private String sid;
	private double fee;

	//	default con
	
	public Student() {
		super();
		System.out.println("Student Defult");
	}
//	over con
	public Student(String NIC, String name,String sid, double fee) {
			//super();
		
		// if we are not adding super() compiler will added it automatically. it means compiler will added super default constructor
//		 then it belongs to parent class default constructor and then print the person class default constructor and then print the sub class overloaded constructor
		
		super
}