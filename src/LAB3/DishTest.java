package LAB3;

public class DishTest {
    public static void main(String[] args) {
        Pot Gorshok = new Pot("clay", 899,5);
        Plate Tarelka= new Plate("glass",600,75);

        Tarelka.DisplayInfo();
        Gorshok.DisplayInfo();
    }
}
