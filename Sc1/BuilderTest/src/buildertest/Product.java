package buildertest;

import java.util.LinkedList;

/**
 *
 * @author SOUMIT
 */
public class Product {
    private final LinkedList<String> itemsinbag;
    private final LinkedList<String> itemsincup;
    public Product(){
        itemsinbag = new LinkedList<>();
        itemsincup = new LinkedList<>();
    }
    
    public void addItemInBag(String item){
        itemsinbag.add(item);
    }
    
    public void addItemInCup(String drinks){
        itemsincup.add(drinks);
    }
    
    public void ShowBag(){
        System.out.println("Inside Bag :");
        for (int i = 0; i < itemsinbag.size(); i++) {
            System.out.println(itemsinbag.get(i));
        }
    }
    public void ShowCup(){
        System.out.println("Drinks In Cup :");
        for (int i = 0; i < itemsincup.size(); i++) {
            System.out.println(itemsincup.get(i));
        }
    }
}
