class Student{
	private float marks1;
	private float marks2;
	private float marks3;

	// (1) (a)
	public Student(double marks1, double marks2, double marks3) {
		super();
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public void calAvg() {
		this.avg = (this.marks1 + this.marks2 + this.marks3)/3.0;
	}
	
}

