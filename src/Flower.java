public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public String zavlazovani(int plus){
        chanceOfGrowth = chanceOfGrowth + plus;
        return "Sance zvysena";
    }

    public static Flower vyberKyku(int plant){
        switch (plant){
            case 1:
                return new Carrot();
            case 2:
                return new Tomato();
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

}
