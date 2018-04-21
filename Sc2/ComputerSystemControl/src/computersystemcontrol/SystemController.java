package computersystemcontrol;

/**
 *
 * @author SOUMIT
 */
public class SystemController {
    public static ResolutionFactory getRsolutionFactory(String Resolution){
        if(Resolution.equalsIgnoreCase("HIGH")) return new HighResolutionFactory();
        if(Resolution.equalsIgnoreCase("LOW")) return new LowResolutionFactory();
        return null;
    }
}
