package creational_patterns.singleton_pattern.example1;

/**
 * @author Ben Meddeb Lotfi
 *
 */

public class Principal {
	
	public static void main (String [] args)
	{
		
		//Test First Usage (Lazy Singleton)
        testLazySingleton();

        //Test Second Usage (Thread Safe)
        testThreadSafeSingleton();		
	}
	
	 private static void testLazySingleton() {
	        LazySingleton inst1 = LazySingleton.getInstance();
	        LazySingleton inst2 = LazySingleton.getInstance();

	        System.out.println(inst1.hashCode());
	        inst1.printData();

	        System.out.println(inst2.hashCode());
	        inst2.printData();
	    }


	    private static void testThreadSafeSingleton() {
	        new DataPrinter().start();

	        new DataPrinter().start();

	    }

	
	
}
