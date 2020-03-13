package test1;

import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City) and somwthing else
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
	
	for(String key: capitalCities.keySet())
	{
		System.out.println("key="+key+" value="+capitalCities.get(key));
	}
  }
}
