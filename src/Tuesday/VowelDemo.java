package Tuesday;

import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		
		Scanner sc= new Scanner(System.in);
		String words = sc.nextLine();
		char[] c=words.toCharArray();
		
		int count = 0;
		
		for(char ch:c)
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
					
			}
		}
		System.out.println("number of vowels"+count);
	}

}
