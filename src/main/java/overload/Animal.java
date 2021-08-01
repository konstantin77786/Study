package overload;

import java.util.ArrayList;

public class Animal {
    int age;
    String color;
    boolean isAlive;
    ArrayList<Animal> childs;
    ArrayList<Integer> weight;

    public Animal(int vozrast, String color, ArrayList<Animal> childs) {
        age = vozrast;
        this.color = color;
        this.childs = childs;
    }

    public Animal(int vozrast) {
        age = vozrast;
    }

    public Animal(String color) {
        this.color = color;
    }

    public Animal() {
        System.out.println("Создали животное.");
    }
}
