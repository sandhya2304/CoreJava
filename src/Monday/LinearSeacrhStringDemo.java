package Monday;

public class LinearSeacrhStringDemo {

	public static void main(String[] args)
	{
		String []words = {"sandhya","harsh","sandhya"};
		
		String item = "ram";
		int temp = 0;
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(item))
			{
				System.out.println("words at "+i);
				temp =+ 1;
			}
		}
     if(temp==0)
     {
    	 System.out.println("words not present");
     }
		
	}

}
