package OOP.lab;
import java.util.Scanner;

//    Exercise 7 (Time: 5 minutes)
//    Write a Java program to add two integers and display the sum and the average of two Integers.
//    Declare two integer variables to store the numbers to be added
public class EX07 {
    public static void main(String[] args) {
        System.out.println("Please enter two integers: ");
        Scanner sc =new Scanner (System.in);

        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        int sum = no1 + no2;
        float avg = (float) (sum / 2.0);
        System.out.println("Sum of two numbers: "+ sum);
        System.out.println("Average of two numbers: " + avg);


    }
}
