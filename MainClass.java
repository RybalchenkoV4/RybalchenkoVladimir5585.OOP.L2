public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(1000);
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
    
}