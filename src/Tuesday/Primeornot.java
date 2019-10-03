package Tuesday;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) 
	{
		boolean prime = true;
		
		System.out.println("Enter the number to check prime or not");
        Scanner sc = new Scanner(System.in);
        Integer numb=sc.nextInt();
        
        for(int i=2;i<numb;i++)
        {
        	if(i%2==0)
        	{
        		prime=false;
        	}
        }
		
		if(prime==true)
		{
			System.out.println("no. is prime!!!");
		}else
		{
			System.out.println("not prime");
		}
	}

}
