package vehicule;

public class Moto extends Vehicule{
    public Moto(String brand) {
        super(brand);
    }

    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}