package creational_patterns.singleton_pattern.example2;

/**
 * @author Ben Meddeb Lotfi
 *
 */

public class SingltonSyncronized {
	
	private static SingltonSyncronized single_instance;
	
	//Here using synchronized makes sure that only one thread at a time can execute getInstance()
	
	public static synchronized SingltonSyncronized getInstance() {
		return single_instance == null ? new SingltonSyncronized() : single_instance;
	}

}
