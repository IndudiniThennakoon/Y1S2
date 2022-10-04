package abstract_exerice;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSounds();

        Animal cat = new Cat();
        cat.eat();
        cat.makeSounds();
    }
}
