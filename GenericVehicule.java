import vehicule.Vehicule;

public class GenericVehicule<T extends Vehicule> {
    private T aVariable;

    public GenericVehicule(T instance){
        this.aVariable = instance;
    }

    public T getaVariable() {
        return aVariable;
    }

    public void setaVariable(T aVariable) {
        this.aVariable = aVariable;
    }

    public int getNumberOfWheels(){
        return this.aVariable.getNumberOfWheels();
    }

    public String getBrand(){
        return this.aVariable.getBrand();
    }
}