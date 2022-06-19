package creational_patterns.singleton_pattern.example2;

/**
 * @author Ben Meddeb Lotfi
 *
 */

// Java program implementing Singleton class with using  getInstance() method


class LazySingleton {
	
 // Static variable reference of single_instance of type Singleton
 private static LazySingleton single_instance;

 // Declaring a variable of type String
 public String s;

 // Constructor
 // Here we will be creating private constructor restricted to this class itself
 private LazySingleton()
 {
     s = "Hello I am a string part of Singleton class";
 }


 // Static method to create instance of Singleton class
 public static LazySingleton getInstance()
 {
     if (single_instance == null)
         single_instance = new LazySingleton();

     return single_instance;
 }
 
}

/**
 * The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, 
 * it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern 
 * and both threads will get the different instances of the singleton class. In next section, 
 * we will see different ways to create a thread-safe singleton class.
 */