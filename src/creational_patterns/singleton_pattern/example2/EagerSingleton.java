package creational_patterns.singleton_pattern.example2;

/**
 * @author Ben Meddeb Lotfi
 *
 */

public class EagerSingleton {
	
private static final EagerSingleton instance = new EagerSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

}
