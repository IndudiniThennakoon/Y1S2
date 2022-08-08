class main {
  public static void main(String[] args) {
	Student s1 = new Student(001,"Indu", 60.3, 65.00);
	
	System.out.println("Student No:" + s1.getStNo());
	System.out.println("Student Name:" + s1.getName());
	System.out.println("Student CA:" + s1.getCA());
	System.out.println("Student Final:" + s1.getFinalMarks());

	System.out.println("Student Total:" + s1.totalMarks());
	}
}