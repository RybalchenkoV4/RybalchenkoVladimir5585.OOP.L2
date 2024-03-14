import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Barsik", 5);
        Cat cat1 = new Cat("Persik", 10);
        Cat cat2 = new Cat("Jorik", 8);
        Cat cat3 = new Cat("Iscariot", 2);

        Plate plate = new Plate(100);
        plate.info();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat0);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " -> " + cat.isSatiety());
        }

        plate.info();

        plate.addFood(35);

        plate.info();
    }
    
}