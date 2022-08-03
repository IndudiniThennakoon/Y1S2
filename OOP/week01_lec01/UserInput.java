import java.util.Scanner;
//import java.util.Arrays;

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

		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("Enter number 1 = ");
		// int no1 = myscanner.nextInt();
		// System.out.println("Enter number 2 = ");
		// int no2 = myscanner.nextInt();
		// System.out.println("Enter number 2 = ");
		// int no3 = myscanner.nextInt();

		// int min;

		// if((no1 < no2) && (no1 < no3)){
		// 	min = no1;
		// }else if((no2 < no3) && (no2 < no1)){
		// 	min = no2;
		// }else{
		// 	min =no3;
		// }

		// int max;
		
		// if((no1 > no2) && (no1 > no3)){
		// 	max = no1;
		// }else if((no2 > no3) && (no2 > no1)){
		// 	max = no2;
		// }else{
		// 	max =no3;
		// }
		// System.out.println("The smallest = " + min);
		// System.out.println("The largest = " + max);


		//EX 02 - using for loop

		// int arr[] = new int[3];
		// int max = 0;
		// int min = 0;
		// Scanner myscanner = new Scanner(System.in);
		// for (int i = 0; i <3; i ++)
		// {
		// 	System.out.print("Enter Integer: ");
		// 	arr[i] = myscanner.nextInt();
		// }
	
		// for(int k = 0 ; k <3 ; k++){
		// 	if(max < arr[k]){ 
		// 		max = arr[k];
		// }

		// min = arr[0]; 

		// for(int l = 0 ; l<3 ; l++){
		// 	if(min > arr[l]){ 
		// 		min = arr[l]; 
		// 	}
		// }
		// System.out.println("Max: " + max);
		// System.out.println("Min: " + min);

		// EX 03 - find how many odd and even numbers entered

		int odd = 0;
		int even = 0;
		int no =0;

		Scanner myscanner = new Scanner(System.in);

		for(int i = 1; i <= 10; i++){
			System.out.print("Enter no" + i + " = ");
			no = myscanner.nextInt();
			if((no %2) == 0){
				System.out.println("No = " + no + " is even ");
				even ++;
			}else{
				System.out.println("No = " + no + " is odd ");
				odd++;
			}
		}
		System.out.print("No of Evens = " + even);
		System.out.print("No of Odd = " + odd);
	}
}