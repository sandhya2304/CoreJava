package Tuesday;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) 
	{
		int[] arry= {1,3,4,5,6};
		int miss=missingNumber(arry, 6);
		System.out.printf("missing number in array %s is %d %n",Arrays.toString(arry),miss);

	}
	
	
	public static int missingNumber(int[] a,int n)
	{
		int actualSum = 0;
		int expectedSum= (n*(n+1)/2);
		
		for(int i:a)
		{
			actualSum +=i;
		}
		return expectedSum-actualSum;
		
	}

}
