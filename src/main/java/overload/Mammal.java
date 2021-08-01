package overload;

public interface Mammal {
     boolean feed();
     default void run(){
          System.out.println("Бег");
     }
}

