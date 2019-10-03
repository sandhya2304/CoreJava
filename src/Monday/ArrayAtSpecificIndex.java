package Monday;

public class ArrayAtSpecificIndex {

	public static void main(String[] args)
	{
		int a[] = {1,4,5,79,9};

		int pos = 3;
		
		int element =100;
		//pos-1 is index
		//must remeber index position or alny position
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i] = a[i-1];
		}
		a[pos-1] = element; //here elemnt insert
		
		for(int i=0;i < a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
