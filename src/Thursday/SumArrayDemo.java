package Thursday;

import java.util.Scanner;

public class SumArrayDemo {

	public static void main(String[] args)
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("entr size of elements");
		int n=sc.nextInt();
		
		int arry[] = new int[n];

		System.out.println("Enter the elements in arrays");
		
		for(int i=0;i<n;i++)
		{
			arry[i] =sc.nextInt(); 
		}
		
		for(int nn:arry)
		{
			sum+=nn;
		}
		
		System.out.println("sum ="+sum);
		
	}

}
