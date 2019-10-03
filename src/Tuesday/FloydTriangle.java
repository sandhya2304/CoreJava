package Tuesday;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) 
	{
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n = sc.nextInt();
		System.out.println("Floyd triangle");
		
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}

	}

}
