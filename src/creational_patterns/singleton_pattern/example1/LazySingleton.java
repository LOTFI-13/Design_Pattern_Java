package creational_patterns.singleton_pattern.example1;

/**
 * @author Ben Meddeb Lotfi
 *
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LazySingleton 
{
	private String [] lettres = {"a","b","c","d","e","f"};
	private List<String>  data= Arrays.asList(lettres);
	private static LazySingleton instance;
	
	private LazySingleton()
	{
		Collections.shuffle(data);
	}
	
	public static LazySingleton getInstance()
	{
		if(instance==null)
		{
			instance = new LazySingleton();
		}
		
		return instance;
	}
	
	public void printData()
	
	{
		for(String str : data)
		{
			System.out.printf("%s ",str);
		}
		System.out.println();
	}
	

}
