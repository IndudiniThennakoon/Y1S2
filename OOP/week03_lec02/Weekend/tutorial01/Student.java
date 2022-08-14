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
// (1) (c)
	public Student(int id, String name, double marks1, double marks2, double marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
// (1) (b)
	public void calAvg() {
		this.avg = (this.marks1 + this.marks2 + this.marks3)/3.0;
	}

	//  (1) (c)
	public void displayDetails() {
		System.out.println("ID: " + this.id );
		System.out.println("Name: " + this.name );
		System.out.println("Average: " + this.avg );
	}
}

