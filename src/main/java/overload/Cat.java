package overload;

public class Cat extends AbstractAnimal implements Mammal{
    @Override
    void eat() {

    }

    @Override
    public boolean feed() {
        return false;
    }

    @Override
    public void run() {
        Mammal.super.run();
    }
}
