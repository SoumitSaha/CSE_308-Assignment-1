package computersystemcontrol;

/**
 *
 * @author SOUMIT
 */
public abstract class ResolutionFactory {
    abstract DispDriver getDispDri(String dispRes);
    abstract PrintDriver getPrintDri(String printRes);
}
