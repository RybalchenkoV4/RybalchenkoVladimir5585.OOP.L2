public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public boolean getSatiety(){
        return satiety;
    }

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

    public void eat(){

    }
}
