package Thursday;

import java.util.Arrays;

public class AnagramNumb {

	public static void main(String[] args) 
	{
		String str1 = "java";
		String str2 = "avaj";
		
		System.out.println(anagramCheck(str1, str2));

	}
	
	public static boolean anagramCheck(String s1,String s2)
	{
		char[] charArrayFromString1 = s1.toCharArray();
		char[] charArrayFromString2 =s2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		return Arrays.equals(charArrayFromString1,charArrayFromString2);
	}
}
