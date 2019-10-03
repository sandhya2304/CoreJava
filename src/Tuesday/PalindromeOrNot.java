package Tuesday;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args)
	{
		String reverse = "";
		
		Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the string");
	   String original = sc.nextLine();
	   
	   for(int i = original.length()-1;i>=0;i--)
	   {
			reverse = reverse+original.charAt(i);
	   }
	
	   if(original.equalsIgnoreCase(reverse))
	   {
		   System.out.println("String is palindrome");
	   }else
	   {
		   System.out.println("not panlindomejava");
	   }

	}

}
