package OOP.lab;
import java.util.Scanner;
//Exercise 4 (Time: 5 minutes)
//        Write a program to display the day of the week when you provide the value.
//        Expected Output
//        Value of the day : 4
//        Day of the week : Thursday
//        Good Bye!
//        You must use “switch – case” statement.
//        Display “Invalid Day” when some invalid value is provided.
//        Message “Good Bye” must appear at last.
public class EX4 {
    public static void main(String[] args) {
        System.out.print("Value of the day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


        switch(day){

            case 1:
                System.out.print("Day of the week : Monday");
                break;

            case 2:
                System.out.print("Day of the week : Tuesday");
                break;

            case 3:
                System.out.print("Day of the week : Wednesday");
                break;

            case 4:
                System.out.print("Day of the week : Thursday");
                break;

            case 5:
                System.out.print("Day of the week : Friday");
                break;

            case 6:
                System.out.print("Day of the week :Saturday");
                break;

            case 7:
                System.out.print("Day of the week :Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }

        System.out.println("\nGood Bye!");



    }

}
