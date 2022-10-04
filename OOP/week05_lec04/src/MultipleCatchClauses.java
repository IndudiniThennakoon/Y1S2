import org.omg.CORBA.ARG_OUT;

public class MultipleCatchClauses {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        }catch (ArithmeticException ar){
            System.out.println("Divided by zero: " +ar);
        }catch (ArrayIndexOutOfBoundsException arr){
            System.out.println("Array Index Out of bound " + arr);
        }
        System.out.println("After try/catch blocks");
    }
}
