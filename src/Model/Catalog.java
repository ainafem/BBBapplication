package Model;

import java.util.ArrayList;

/**
 * Catalog class: Has all the information about the apartments available.
 * @author jose
 */
public class Catalog {
    private ArrayList <Apartment> list;
    
    /**
     * Constructor of the class Catalog
     */
    public Catalog (){
        list = new ArrayList <Apartment>();
    }
    
    /**
     * Method to return the apartment asociated to the index passed as a parameter.
     * @param index
     * @return 
     */
    public Apartment getApartmentByIndex (int index){
        return this.list.get(index);
    }
    
    /**
     * Method to remove the apartment associated to the index passed as a parameter.
     * @param index 
     */
    public void removeApartment(int index){
        this.list.remove(index);
    }
    
    /**
     * Method to remove the apartment passed as a parameter.
     * @param apartment 
     */
    public void removeApartment(Apartment apartment){
        this.list.remove(apartment);
    }
    
    /**
     * Method to check if the catalog is empty.
     * @return 
     */
    public boolean listIsEmpty(){
        return this.list.isEmpty();
    }
    
    /**
     * Method to add the apartment passed as a parameter.
     * @param apartment 
     */
    public void addApartment(Apartment apartment){
        this.list.add(apartment);
    }
    
    public ArrayList getArrayList(){
        return this.list;
    }
    /**
     * ToString returns the list of apartments available.
     * @return String of the list of apartments available.
     */
    @Override
    public String toString(){
        int incremento = 0;
        String aux = "";
        
        for (incremento = 0; incremento >= list.size(); incremento++){
            aux = aux + list.get(incremento).toString() + "/n";
        }
        return aux;
    }
    
}
    