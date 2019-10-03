package Thursday;

import java.util.Arrays;

public class SecondLargestNumb {

	public static void main(String[] args)
	{
		int arry[]= {1,5,2,8,3,5};
		
		Arrays.sort(arry);
         System.out.println("first hight element"+arry[arry.length-1]);
         System.out.println("second hight element"+arry[arry.length-2]);
	
	}

}
