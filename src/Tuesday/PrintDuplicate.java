package Tuesday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		String str = "sandhya";
      displayduplicate(str);
	}
	
	public static void displayduplicate(String s)
	{
		Map<Character,Integer> map =new HashMap<Character, Integer>();
		char[] characters = s.toCharArray();
 		
		for(char c:characters)
		{
			if(!map.containsKey(c))
			{
				map.put(c,1);
			}else
			{
				map.put(c,map.get(c)+1);
			}
			
			Set<Map.Entry<Character, Integer>> entryset = map.entrySet();
			for(Map.Entry<Character, Integer> entry:entryset)
			{
				if(entry.getValue()>1)
				{
					System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
				}
			}
			
			
		}
		
		
	}

}
