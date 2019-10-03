package Wednesday;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayAscDesc {

	public static void main(String[] args)
	{
		
		String str[]= {"a","b","c","d"};
		
        System.out.println("before sorting!!!");		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		Arrays.sort(str);
		
		 System.out.println("after sorting!!!");		
			for(String s:str)
			{
				System.out.println(s);
			}
			
			Arrays.sort(str,Collections.reverseOrder());
			
			 System.out.println("after sorting indesc!!!");		
				for(String s:str)
				{
					System.out.println(s);
				}

	}

}
