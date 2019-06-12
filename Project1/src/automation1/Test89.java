package automation1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test89 {
	
	public static void main(String[] args)
	{		
		HashMap<String,String> map = new HashMap<>();
		map.put("Name", "Amrita");
		map.put("City", "Kolkata");
		map.put("Area", "Blh");
		
		System.out.println(map);
		System.out.println(map.get("Name"));
		System.out.println(map.get("city"));
		
		map.put("City", "Mysore");
		System.out.println(map.get("City"));
		
		System.out.println(map.containsKey("Area"));
		System.out.println(map.containsKey("Road"));
		
		/*
		Set key = map.keySet();
		System.out.println(key);
		
		for(Map.Entry<String,String> list:map.entrySet())
		{
			System.out.println("Keys:" + list.getKey() +", Values:" +list.getValue());
			
		}
		*/
		
		Set<String> allKeys = map.keySet();
		System.out.println(allKeys);
		
		for(String key:allKeys)
		{
			System.out.println(key);
		}
		Collection<String> allValues = map.values();
		System.out.println(allValues);
		
		for(String value:allValues)
		{
			System.out.println(value);
		}
	}

}
