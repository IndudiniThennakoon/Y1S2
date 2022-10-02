package OOP.lab;

//        Exercise 5 (Time: 10 minutes)
//        Write a program that draws the following figures one above the other.
//
//        Using while loop                 Using for loop
//        * * * * *                               *
//        * * * * *                             *    *
//        * * * * *                           *    *   *
//        * * * * *                         *    *   *    *
//        * * * * *                       *    *   *    *    *

public class EX5 {
    public static void main(String[] args) {
       int i = 1;
       while(i <= 5){
           int j = 1;
           while(j <=5){
               System.out.print("* ");
               j++;
           }
           System.out.println();
            i++;
        }
    }
}
