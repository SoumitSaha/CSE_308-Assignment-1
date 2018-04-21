package computersystemcontrol;

/**
 *
 * @author SOUMIT
 */
public class LowResolutionFactory extends ResolutionFactory{
    @Override
    DispDriver getDispDri(String dispRes) {
        if(dispRes == null) return null;
        if(dispRes.equalsIgnoreCase("LOW")) return new LowResolutionDD();
        return null;
    }

    @Override
    PrintDriver getPrintDri(String printRes) {
        if(printRes == null) return null;
        if(printRes.equalsIgnoreCase("LOW")) return new LowResolutionPD();
        return null;
    }
}
