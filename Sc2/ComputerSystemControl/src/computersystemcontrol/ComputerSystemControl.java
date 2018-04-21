package computersystemcontrol;

import java.util.Scanner;

/**
 *
 * @author SOUMIT
 */
public class ComputerSystemControl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the resolution(LOW, HIGH) : ");
        String res;
        res = in.nextLine();
        ResolutionFactory fac = SystemController.getRsolutionFactory(res);
        DispDriver dispdriver = fac.getDispDri(res);
        PrintDriver printdriver = fac.getPrintDri(res);
        dispdriver.dispDri();
        printdriver.printDri();
    }
    
}
