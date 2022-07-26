import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		/*
		System.out.println("Indudini");
		System.out.println("Kurunegala");
		System.out.println("2000");

		// System.out.println Vs. System.out.print

		System.out.print("Indudini\t");
		System.out.print("Kurunegala\t");
		System.out.print("2000");
		*/

		// variable

		/*
		int no = 50;
		long population = 7000000000000L;
		double salary = 4500.64;
		float rate = 34.5f;

		System.out.println("no : " + no);
		System.out.println("population : " + population);
		System.out.println("salary : " + salary);
		System.out.println("rate : " + rate);
		*/

		// userInput

		System.out.println("Enter length: ");
		Scanner myscanner = new Scanner(System.in);
		int length = myscanner.nextInt();

		System.out.println("Enter width: ");
		int width = myscanner.nextInt();

		int perimeter = 2 * ( length + width );

		System.out.println("Perimeter: " + perimeter);

		
		

  }
}