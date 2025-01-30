public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public String zavlazovani(int plus){
        System.out.println("PPPPP");
        chanceOfGrowth = chanceOfGrowth + plus;
        return "Sance zvysena";
    }

    public static Flower vyberKyku(int plant){
        switch (plant){
            case 1:
                return new Carrot("carrot",20,10,50);
            case 2:
                return new Tomato("tomato",30,20,50);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }
}
