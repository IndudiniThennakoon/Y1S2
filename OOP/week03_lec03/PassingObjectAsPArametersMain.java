public class PassingObjectAsPArametersMain {
    public static void main(String[] args) {
        PassingObjectAsParameter ob = new PassingObjectAsParameter;
        ob.show(45);

        PassingObjectAsParameter ob2 = new PassingObjectAsParameter;
        ob.show(ob); // passing entire object
    }
}
