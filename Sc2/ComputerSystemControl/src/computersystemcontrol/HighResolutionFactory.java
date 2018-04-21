package computersystemcontrol;

/**
 *
 * @author SOUMIT
 */
public class HighResolutionFactory extends ResolutionFactory{

    @Override
    DispDriver getDispDri(String dispRes) {
        if(dispRes == null) return null;
        if(dispRes.equalsIgnoreCase("HIGH")) return new HighResolutionDD();
        return null;
    }

    @Override
    PrintDriver getPrintDri(String printRes) {
        if(printRes == null) return null;
        if(printRes.equalsIgnoreCase("HIGH")) return new HighResolutionPD();
        return null;
    }
    
}
