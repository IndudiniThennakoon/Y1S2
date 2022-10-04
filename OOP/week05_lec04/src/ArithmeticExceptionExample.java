public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int num1 = 10, num2 =10,div;
        try{
            div= num2 / num1; // we cannot divide num2 by num1 (zero)
        }catch (ArithmeticException ar)
        {
            System.out.println("cannot divide by zero");
        }finally{
            System.out.println("hi");
        }
    }
}