import java.util.Scanner;

public class CreateOwnExpetionMain {
    public static void main(String[] args) {
        System.out.println("Enter your student ID: ");
        Scanner sc =new Scanner (System.in);
        String id = sc.nextLine();

        try{
            if (id.startsWith("it")){
               throw new CreateOwnException("java.lang.Invalid student id");
            }
        }catch (CreateOwnException cr){
            System.out.println(cr);
            System.out.println("Your IT should be uppercase");
        }finally{
            System.out.println("Hi " + id);
        }

    }
}
