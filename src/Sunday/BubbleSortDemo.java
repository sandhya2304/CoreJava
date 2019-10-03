package Sunday;

public class BubbleSortDemo 
{
	public static void main(String[] ars)
	{
	   int arry[]= {9,6,3,7,1,2,3};
	   System.out.println("before sorting ...");
	   
	   for(int i:arry)
	   {
		   System.out.print(i);
	   }
	   bubbleSort(arry);
	   System.out.println("after sorting ...");
	   for(int i:arry)
	   {
		   System.out.print(i);
	   }
	}
	
	public static void bubbleSort(int[] aa)
	{
		int temp;
		
		for(int i=0;i<aa.length;i++)
		{
			for(int j=1;j<(aa.length)-i;j++)
			{
				if(aa[j-1]>aa[j])
				{
					temp = aa[j-1];
					aa[j-1] = aa[j];
					aa[j] = temp;
				}
				
			}
		}
		
		
	}
	
	

}
