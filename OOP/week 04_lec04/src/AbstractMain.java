public class AbstractMain {
    public static void main(String[] args) {
        //Shape ob = new Shape(); -wrong (getting error)
        // here we got an error because we cannot create instances(objects) from an abstract class

        Rectangle ob =new Rectangle();
        ob.getArea();

    }

}
