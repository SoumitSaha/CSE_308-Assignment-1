package buildertest;

/**
 *
 * @author ASUS
 */
public class ChildrenMeal implements Crew{

    private Product meal;
    private String main;
    private String side;
    private String toy;
    private String drinks;
    
    public ChildrenMeal(String MainDish, String SideDish, String Toy, String Drinks){
        main = MainDish;
        side = SideDish;
        toy = Toy;
        drinks = Drinks;
        meal = new Product();
    }
    @Override
    public void prepareMainDish() {
        meal.addItemInBag(main);
    }

    @Override
    public void prepareSideDish() {
        meal.addItemInBag(side);
    }

    @Override
    public void getToy() {
        meal.addItemInBag(toy);
    }
    
    @Override
    public Product getChildrenMeal(){
        meal.addItemInCup(drinks);
        return meal;
    }
    
}
