import java.io.*;

class Throws {
    public static void main(String[] a) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        System.out.print("Enter an integer value : ");
        text = in.readLine();
        int num = Integer.parseInt(text);
        System.out.println("You inserted " + num);
    }
}

