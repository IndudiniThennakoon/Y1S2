class Student{
	private int stNo;
	private String Name;
	private float CA;
	private double finalMarks;

	// // intialize with only IDno

	// public Student (int stNo){
	// 	this.stNo = stNo;
	// }

	// //  intialize with IDno and name

	// public Student (int stNo, String Name){
	// 	this.stNo = stNo;
	// 	this.Name = Name;
	// }

	//  intialize all 

	public Student (int stNo, String Name,float CA,double finalMarks){
		this.stNo = stNo;
		this.Name = Name;
		this.CA = CA;
		this.finalMarks = finalMarks;
	}

	public void setStNo(int stNo){
		this.stNo = stNo;
	}

	public int getStNo(){
		return stNo;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public String getName(){
		return Name;
	}

	public void setCA(float CA){
		this.CA =CA;
	}

	public float getCA(){
		return CA;
	}

	public void setFinalMarks(double finalMarks){
		this.finalMarks = finalMarks;
	}
	
	public double getfinalMarks(){
		return finalMarks;
	}
	
	// method
	public totalMarks(){
		this.finalMarks = CA + (float) finalMarks;
		return totalMarks();
	}
}