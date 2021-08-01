package overload;

import java.util.ArrayList;

abstract public class AbstractAnimal {
    int age;
    String color;
    boolean isAlive = true;
    ArrayList<AbstractAnimal> childs;
    int weight;

    public AbstractAnimal(int vozrast, String color, ArrayList<AbstractAnimal> childs) {
        age = vozrast;
        this.color = color;
        this.childs = childs;
    }

    public AbstractAnimal(int vozrast) {
        age = vozrast;
    }

    public AbstractAnimal(String color) {
        this.color = color;
    }

    public AbstractAnimal() {
        System.out.println("Создали животное.");
    }

    abstract void eat();

    protected int run(int dist) {
        System.out.println("Животное бежит");
        return 0;
    }
}
