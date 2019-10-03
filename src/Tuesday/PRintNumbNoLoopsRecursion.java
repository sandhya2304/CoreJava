package Tuesday;

public class PRintNumbNoLoopsRecursion {

	public static void main(String[] args)
	{
		printNumb(1);
	}
	
	public static void printNumb(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			printNumb(n+1);
		}
		
	}

}
