public class PassingObjectAsParaneter {

    String name;
    int age;
    public void show() {
        System.out.println("Name is: " + this.name);
    }
    public void show(int x){
        System.out.println("number : " +x);

    }
    public void show(PassingObjectAsParameter ref){
        System.out.println("number : " + x); // print x

    }
    public void show(PassingObjectAsParameter ref){
        System.out.println("number : " + ref.name); // print name

    }
}

