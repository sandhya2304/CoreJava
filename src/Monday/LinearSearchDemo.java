package Monday;

public class LinearSearchDemo {

	public static void main(String[] args) 
	{
		
		int arry[]= {5,3,9,12,90,36,14,7,1};

		int item = 19;
		int temp = 0;
		
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]==item)
			{
				System.out.println("posoiton is at index: "+i);
				temp = temp+1;
			}
		}
        if(temp ==0)
        {
        	System.out.println("item not in index");
        }
	}

}
