import vehicule.Moto;
import vehicule.Voiture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessExample {
    Map<String, List<GenericVehicule>> stock = new HashMap<>();

    public ProcessExample(){
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Ruf")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Ruf")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Ruf")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Peugeot")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Peugeot")));
        addNewVehiculeInMap(new GenericVehicule<>(new Moto("Peugeot")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Citroen")));
        addNewVehiculeInMap(new GenericVehicule<>(new Voiture("Citroen")));

    }

    /**
     * Pour ajouter une nouvelle valeur
     * On vérifie d'abord si la liste n'existe pas déja
     * sinon on la rajoute dans la map
     * @param vehicule
     */
    private void addNewVehiculeInMap(GenericVehicule vehicule){
        if(stock.get(vehicule.getBrand()) != null){
            stock.get(vehicule.getBrand()).add(vehicule);
        } else{
            List<GenericVehicule> list = new ArrayList<>();
            list.add(vehicule);
            stock.put(vehicule.getBrand(), list);
        }
    }

    /**
     * On récupère la liste qui nous interesse via sa clé
     * on la parcours ensuite vérifiant l'instance de l'objet pour trouver celle qui nous interesse
     * @param brand
     * @param clazz
     * @return
     */
    public int getNumberOfStock(String brand, Class clazz){
        int cpt = 0;
        for (GenericVehicule v : stock.get(brand)){
            if(v.getaVariable().getClass() == clazz){
                cpt++;
            }
        }
        return cpt;
    }
}