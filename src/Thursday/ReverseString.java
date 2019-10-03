package Thursday;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		String reverse = "";
		String input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		input = sc.nextLine();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		
		System.out.println("revesr here  "+reverse);

	}

}
