package automation1;

import java.util.*;

public class Test91 {
	
	public static void main(String[] args)
	{		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		map.put("Projector", 1);
		map.put("Chair", 100);
		
		System.out.println(map);
		
		Set key = map.keySet();
		System.out.println(key);
		
		for(Map.Entry<String,Integer> list:map.entrySet())
		{
			System.out.println(list.getKey() +" no is : " +list.getValue());
			
		}
	}

}
