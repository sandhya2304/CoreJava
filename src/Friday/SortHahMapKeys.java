package Friday;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHahMapKeys {

	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String, String>();
		map.put("apple", "apple");	
		map.put("grapes", "grapes");
		map.put("banana", "banana");
		
		for(Map.Entry<String,String> entry:map.entrySet())
		{
			System.out.println("key values :"+entry.getKey());
		}
		
		Map<String,String> treemap = new TreeMap<String, String>(map);
		for(Map.Entry<String,String> entry:treemap.entrySet())
		{
			System.out.println("key values :"+entry.getKey());
		}
		

	}

}
