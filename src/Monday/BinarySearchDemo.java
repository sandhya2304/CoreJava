package Monday;

public class BinarySearchDemo {

	public static void main(String[] args)
	{
		int arry[] = {1,2,3,4,5,6,7,9};

		int search = 9;
		
		int li = 0;
		int hi = arry.length-1;
		
		int mi = (li+hi)/2;
		
		while(li <= hi)
		{
			if(arry[mi] == search)
			{
				System.out.println("number at this index: "+mi);
				break;
			}
			//mi less than search
			else if(arry[mi] < search)
			{
				li = mi+1;
			}
			else 
			{
				hi = mi-1;
			}	
			mi = (li+hi)/2;
		}
		if(li > hi)
		{
			System.out.println("search not found");
		}
		
	}

}
