package Sunday;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString
{
	public static void main(String[] args)
	{
		String w ="java";
	    System.out.println(removeDuplicate(w));
	}
	
	
	public static String removeDuplicate(String words)
	{
		Set<String> set=new HashSet<String>();
		StringBuffer buffer =new StringBuffer();
		
		for(int i=0;i<words.length();i++)
		{
			Character c = words.charAt(i);
			if(!set.contains(c))
			{
				set.add(words);
				buffer.append(c);
			}
			
		}
		return buffer.toString();
	}
	

}
