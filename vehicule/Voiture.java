package vehicule;

public class Voiture extends Vehicule{

    public Voiture(String brand) {
        super(brand);
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}