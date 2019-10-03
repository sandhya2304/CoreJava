package Friday;

import java.util.Arrays;

public class SortCharacters {

	public static void main(String[] args) 
	{
		String str = "sandhya";
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		String sorted = new String(ch);
		System.out.println(sorted);

	}

}
