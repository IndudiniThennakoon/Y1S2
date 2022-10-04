public class MathOpThorwMain {
    public static void main(String[] args) {
        MathOpThrowExample math = new MathOpThrowExample();
        try{
            math.add(2,0);
            math.divide(2,0);
        }catch (ArithmeticException ex){
            System.out.println("Error: division by zero");
        }
    }
}
