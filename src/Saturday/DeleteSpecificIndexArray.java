package Saturday;

import java.util.Arrays;

public class DeleteSpecificIndexArray {

	public static void main(String[] args)
	{
		int[] firstArray = {1,2,3,4,5,6};
		System.out.println("original array"+Arrays.toString(firstArray));
		
		int index = 2;
		
		int[] newArray = new int[firstArray.length-1];
		
		for(int i=0,k=0;i<firstArray.length-1;i++)
		{
			if(i==index)
			{
				continue;
			}
			newArray[k++] = firstArray[i];
		}
		
		System.out.println("new array"+Arrays.toString(newArray));
	}

}
