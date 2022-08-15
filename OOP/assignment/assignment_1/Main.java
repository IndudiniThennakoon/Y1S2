import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {

			RoomChargeCalculator rm = new RoomChargeCalculator();

			System.out.println("Select the Room Category\n");

			System.out.println("1 - Delux-Double\n2 - Standard-Family\n3 - Standard-Single\n4 - Quit");

			Scanner myscanner = new Scanner(System.in);
			int category = myscanner.nextInt();

			boolean balcony = false;
			boolean parking = false;
			boolean tv = false;
			boolean wifi = false;
			boolean kitchen = false;
			boolean garden = false;
			boolean ac = false;

			switch (category) {

			case 1:
				System.out.println("Additional Chargers:  ");
				System.out.println("Balcony = 500 \nParking = 200\nTV = 200\nKitchen = 1000\nWifi =100\n");
				System.out.println("Please enter true or false");

				System.out.print("Balcony : ");
				balcony = myscanner.nextBoolean();
				System.out.print("Parking : ");
				parking = myscanner.nextBoolean();
				System.out.print("TV : ");
				tv = myscanner.nextBoolean();
				System.out.print("Kitchen : ");
				kitchen = myscanner.nextBoolean();
				System.out.print("Wifi : ");
				wifi = myscanner.nextBoolean();

				rm.getChargeDeluxDouble(balcony, parking, tv, kitchen, wifi);

				break;

			case 2:
				System.out.println("Additional Chargers:  ");
				System.out.println("Parking = 200\nKitchen = 500\nGarden =200\n");
				System.out.println("Please enter only true or false");

				System.out.print("Parking : ");
				parking = myscanner.nextBoolean();
				System.out.print("Kitchen : ");
				kitchen = myscanner.nextBoolean();
				System.out.print("Garden : ");
				garden = myscanner.nextBoolean();

				rm.getChargeStandardFamily(parking, kitchen, garden);

				break;

			case 3:
				System.out.println("Additional Chargers:  ");
				System.out.println("Parking = 200\nAC = 500\nWifi =100\n");
				System.out.println("Please enter only true or false");

				System.out.print("Parking : ");
				parking = myscanner.nextBoolean();
				System.out.print("Kitchen : ");
				ac = myscanner.nextBoolean();
				System.out.print("Garden : ");
				wifi = myscanner.nextBoolean();

				rm.getChargeStandardSingle(parking, ac, wifi);

				break;
				
			case 4: 
				break;

			default:
				System.out.println("\nInvaild Input!!! Have a nice day!!!");
				break;

			}

		} catch (Exception exp) {
			System.out.println("Please enter valid input");

		}
	}
}
