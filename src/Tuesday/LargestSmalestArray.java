package Tuesday;

public class LargestSmalestArray {

	public static void main(String[] args) 
	{
		int array[]= {2,3,1,9,35,74,2,100};
		
		int largest=Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int number:array)
		{
			if(number>largest)
			{
				largest=number;
			}else if(number<smallest) {
				smallest=number;
			}
		}
         System.out.println("large"+largest);
         System.out.println("small"+smallest);
	}

}
