package Saturday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedChar {

	public static void main(String[] args)
	{
		char ch= getNonRepeatedChar("aabbddgghhjjkkz");
		System.out.println(ch);

	}
	
	
	public static char getNonRepeatedChar(String str)
	{
		Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>(str.length());
		for(char ch:str.toCharArray())
		{
			countMap.put(ch,countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
		}
		
		for(Entry<Character,Integer> entry : countMap.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("didnt find any non repated words!!!");
		
	}

}
