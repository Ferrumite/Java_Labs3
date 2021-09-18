package LAB3;

public abstract class Dish {
    private String material;
    private int weight;

    public String getMaterial() {
        return material;
    }

    public int getWeight() {
        return weight;
    }

    public Dish(String material, int weight) {
        this.material = material;
        this.weight = weight;
    }

    public abstract void DisplayInfo();
}


