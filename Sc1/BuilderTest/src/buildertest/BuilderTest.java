package buildertest;

import java.util.Scanner;

/**
 *
 * @author SOUMIT
 */
public class BuilderTest {
    public static void main(String[] args) {
        String m, s, t, d;
        Scanner in = new Scanner(System.in);
        System.out.print("Main Dish : ");
        m = in.nextLine();
        System.out.print("Side Dish : ");
        s = in.nextLine();
        System.out.print("Toy : ");
        t = in.nextLine();
        System.out.print("Drinks : ");
        d = in.nextLine();
        
        CounterEmp emp1 = new CounterEmp();
        Crew cook = new ChildrenMeal(m, s, t, d);
        
        emp1.prepareChildrenMeal(cook);
        Product Order = cook.getChildrenMeal();
        
        Order.ShowBag();
        Order.ShowCup();
    }
}
