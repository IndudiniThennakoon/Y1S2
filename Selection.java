class Main {
  public static void main(String[] args) {


		// if -else 

		
		// System.out.println("Enter 1 -5 any number: ");
		// Scanner myscanner = new Scanner(System.in);

		// int opt = myscanner.nextInt();

		// if(opt == 1)
		// {
		// 	System.out.println("Malabe campus");
		// }else if( opt ==2){
		// 	System.out.println("Metro Campus");
		// }else if(opt == 3){
		// 	System.out.println("Matara campus");
		// }else if( opt ==4){
		// 	System.out.println("Kandy Campus");
		// }else if(opt == 5){
		// 	System.out.println("Kurunegala campus");
		// }else{
		// 	System.out.println("Invalid option");
		// }

		// switch

		System.out.println("Enter 1 -3 any number: ");
		Scanner myscanner = new Scanner(System.in);

		int opt = myscanner.nextInt();

		switch (opt){
			case 1 : 
				System.out.println("Malabe campus");
				break;	
			case 2 :
				System.out.println("Metro Campus");
				break;	
			case 3 :
				System.out.println("Matara campus");
				break;
			default:
				System.out.println("Invalid option");
				
		}
	}

}