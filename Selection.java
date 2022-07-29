class Main {
  public static void main(String[] args) {

		System.out.println("Enter 1 -5 any number: ");
		Scanner myscanner = new Scanner(System.in);

		int opt = myscanner.nextInt();

		if(opt == 1)
		{
			System.out.println("Malabe campus");
		}else if( opt ==2){
			System.out.println("Metro Campus");
		}else if(opt == 3){
			System.out.println("Matara campus");
		}else if( opt ==4){
			System.out.println("Kandy Campus");
		}else if(opt == 5){
			System.out.println("Kurunegala campus");
		}else{
			System.out.println("Invalid option");
		}
	}

}