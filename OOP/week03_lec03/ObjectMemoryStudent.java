public class ObjectMemoryStudent {
    private String name;
    private int age;

    public ObjectMemoryStudent(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void showDetails(String name, int age){
        System.out.println("Student name: "+ this.name);
        System.out.println("Student age: "+ this.age);
    }

}
