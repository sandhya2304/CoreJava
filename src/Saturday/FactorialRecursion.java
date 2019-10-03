package Saturday;

public class FactorialRecursion {

	public static void main(String[] args) 
	{
		System.out.println(factorail(0));

	}
	
	public static int factorail(int number)
	{
		if(number == 0)
		{
			return 1;
		}
		
		
		return number * factorail(number-1);
	}

}
