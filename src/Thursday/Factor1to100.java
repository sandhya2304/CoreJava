package Thursday;

public class Factor1to100
{

	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("factor of number:"+i);
		
		    for(int j=1;j<=i;j++)
		    {
		    	if(i%j==0)
		    	{
		    		System.out.println(""+j);
		    	}
		    }
		
		
		}

	}

}
