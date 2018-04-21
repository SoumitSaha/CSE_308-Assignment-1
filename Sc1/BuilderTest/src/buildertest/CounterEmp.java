package buildertest;

/**
 *
 * @author SOUMIT
 */
public class CounterEmp {
    Crew emp;
    public void prepareChildrenMeal(Crew C){
        emp = C;
        emp.prepareMainDish();
        emp.prepareSideDish();
        emp.getToy();
    }
}
