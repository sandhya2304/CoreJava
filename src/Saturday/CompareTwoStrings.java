package Saturday;

public class CompareTwoStrings {

	public static void main(String[] args)
	{
		String s1 = "sandeep";
		String s2 = "sandh";
		
		boolean isCompare = false;
		
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				isCompare = false;
				break;
			}
			isCompare = true;
		}

		System.out.println("both strings are equal ="+isCompare);
	}
	


}
