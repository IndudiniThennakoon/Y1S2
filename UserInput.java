import java.util.Scanner;


class UserInput{
	public static void main(String[] args) {

		// EX 01
		
		// System.out.println("Enter length: ");
		// Scanner myscanner = new Scanner(System.in);
		// int length = myscanner.nextInt();

		// System.out.println("Enter width: ");
		// int width = myscanner.nextInt();

		// int perimeter = 2 * ( length + width );

		// System.out.println("Perimeter: " + perimeter);

		//EX 02

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter number 1 = ");
		int no1 = myscanner.nextInt();
		System.out.println("Enter number 2 = ");
		int no2 = myscanner.nextInt();
		System.out.println("Enter number 2 = ");
		int no3 = myscanner.nextInt();

		int min;

		if((no1 < no2) && (no1 < no3)){
			min = no1;
		}else if((no2 < no3) && (no2 < no1)){
			min = no3;
		}else{
			min =no3;
		}

		System.out.println("The smallest = " + min);
	
	}
}