package creational_patterns.singleton_pattern.example1;

/**
 * @author Ben Meddeb Lotfi
 *
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Java code to explain double check locking
public class ThreadSafeSingleton {
	
	   /** Array of Letters*/
    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    /**List that holds the array of letter */
    private List<String> data = Arrays.asList(LETTERS);

    /**
     * Static instance of the class (volatile so it is not cached)
     * Private instance, so that it can be accessed by only by getInstance() method
     */
    private static volatile ThreadSafeSingleton instance;

    /** Dummy boolean to simulate thread delay */
    private static boolean delayMe = true;


    public static   ThreadSafeSingleton getInstance()
    {
    	if (instance == null) 
    	{
         
    	//synchronized block to remove overhead
         synchronized (ThreadSafeSingleton.class) {
        	 if(instance == null)
        	 {
        		 if(delayMe) 
                 {
                     delayMe = false;
                     Thread.currentThread();
                     try 
                     {
                    	 Thread.sleep(1000);
                     }
                     catch (InterruptedException ie)
                     {}
                 }
        		 // if instance is null, initialize
        		 instance = new ThreadSafeSingleton();
        		 }
        	 } 
         }
        return instance;
        }

    private ThreadSafeSingleton() {
        Collections.shuffle(data);

    }

    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
