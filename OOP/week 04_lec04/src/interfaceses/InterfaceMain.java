package interfaceses;

public class InterfaceMain {
    public static void main(String[] args) {
        Printable printable = new Employee(1, "Amal", "Matara");
        printable.print();

        printable = new Book(1, "Amba Yahaluwo", "T.B. Illanagarathne");
    }
}
