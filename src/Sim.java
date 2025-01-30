import java.util.Scanner;

public class Sim {
    Farm f = new Farm(100);
    Scanner sc = new Scanner(System.in);

    public Sim() {
        while (true) {
            try {
                System.out.println("Vyberte akci:\n1 = Zasadit rostlinu\n2 = Zalit rostlinu");
                int odpoved = sc.nextInt();
                if (odpoved == 1) {
                    System.out.println("Vyber jakou rostlinu zasadit: \n1 = Carrot\n2 = Tomato");
                    int odpoved2 = sc.nextInt();
                    f.addToField(odpoved2);
                    f.ykousk();
                }
                if (odpoved == 2) {
                    System.out.println("Vyber jakou rostlinu chces zalejt");
                    for(int i = 0;i<f.getPlants().size();i++){
                        System.out.println(i+1+"Rostlina: "+f.getPlants().get(i).getName()+" Sance: "+f.getPlants().get(i).getChanceOfGrowth());
                    }
                }

            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

}
