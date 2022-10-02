package OOP.lab;
import java.util.Scanner;

//Exercise 3 (Time: 5 minutes)
//        Write a program to validate a given age of a person using if-else statements.
//        If age is greater than 18 it should print “Adult” otherwise print “Child”.

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18 ){
            System.out.println("Your an adult.");
        }else {
            System.out.println("Your a child.");
        }
    }
}
