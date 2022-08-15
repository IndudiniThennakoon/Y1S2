import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RoomChargeCalculator rm = new RoomChargeCalculator();

		System.out.println("Select the Room Category\n");

			System.out.println("1 - Delux-Double\n2 - Standard-Family\n3 - Standard-Single\n4 - Quit");

		System.out.println("Select the Room Category\n");

		System.out.println("1 - Delux-Double\n2 - Standard-Family\n3 - Standard-Single\n4 - Quit");

		Scanner myscanner = new Scanner(System.in);
		int category = myscanner.nextInt();

		switch (category) {

			case 1:
				System.out.println("Additional Chargers:  ");
				System.out.println("Balcony = 500 \nParking = 200\nTV = 200\nKitchen = 1000\nWifi =100\n");
				System.out.println("Please enter true or false");

		}
}