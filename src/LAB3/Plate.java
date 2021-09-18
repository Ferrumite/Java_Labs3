package LAB3;

public class Plate extends Dish {
    private int Rad;


    public Plate(String material, int weight, int rad) {
        super(material, weight);
        Rad = rad;
    }

    public void DisplayInfo() {
        System.out.println("The plate's radius is " + Rad + "mm, made out of " + super.getMaterial() + ", weights " + super.getWeight() + " grams.");
    }
}
