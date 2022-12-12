package vehicule;

public abstract class Vehicule {
    private String brand;

    public Vehicule(String brand){
        this.brand = brand;
    }

    public abstract int getNumberOfWheels();

    public String getBrand() {
        return brand;
    }
}