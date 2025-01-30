import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> plants;

    private ArrayList<Animal> animals;

    private int size;

    public Farm(int size) {
        this.plants = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.size = size;
    }

    public void addToField(int type){
        if(plants.size()<=5){
            plants.add(Flower.vyberKyku(type));
        }else {
            System.out.println("Pole je plne");
        }
    }
    public void ykousk(){
        for(int i = 0;i<plants.size();i++){
            System.out.println(plants.get(i));
        }
    }
    public String zaliti(int index,int kolik){
        plants.get(index).zavlazovani(kolik);
        return "ZALITO";
    }





}
