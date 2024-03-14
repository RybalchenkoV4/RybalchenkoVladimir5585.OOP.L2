public class Cat {
    private String name;
    private int appetite;

    public String isSatiety() {
        String res = satiety ? "full":"hungry";
        return res;
    }

    private boolean satiety = false;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if(plate.getFood() > appetite) {
            satiety = true;
            plate.setFood(plate.getFood() - getAppetite());
        }
    }

    @Override
    public String toString(){
        String res = satiety ? "full":"hungry";
        return "Cat: {" +
                "\n\tname -> " + name +
                ";\n\tappetite -> " + appetite +
                ";\n\tsatiety -> " + res + ";\n}";
    }
}
