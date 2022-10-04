public class ParseInt {
    public static void main(String[] args) {

    try{
        String num = " 25a";
        int value = Integer.parseInt(num);
    }catch( NumberFormatException numEx ){
        System.out.println("Wrong number format");
    }


    }
}