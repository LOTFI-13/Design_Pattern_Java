package creational_patterns.singleton_pattern.example1;

/**
 * @author Ben Meddeb Lotfi
 *
 */

public class DataPrinter extends Thread {

		
		@Override
		public void run()
		{
			ThreadSafeSingleton.getInstance().printData();
		}
		

}
