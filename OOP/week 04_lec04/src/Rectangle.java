public class Rectangle extends Shape {
    // child class MUST override all the abstract methods of thr parent class
    // If a child class did not override all the abstract method of the parent, then the child class also abstract

    // since we cannot create objects from abstract class, we can remove the abstract keyword
    // and the override the all the abstract methods of the parent class

    private int height;
    private int width;
    public int getArea(){
        return this.height * this.width;
    }

}