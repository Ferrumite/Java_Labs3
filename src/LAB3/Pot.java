package LAB3;

public class Pot extends Dish {
    private int Volume;

    public Pot(String material, int weight, int volume) {
        super(material, weight);
        Volume = volume;
    }

    public void DisplayInfo() {
        System.out.println("The pot's volume is " + Volume + "liters, made out of " + super.getMaterial() + ", weights " + super.getWeight() + " grams.");
    }
}
