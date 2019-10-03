package Monday;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("yello");
		c1.add("blue");
		c1.add("red");
		c1.add("pink");
		
		ArrayList<String> c2= new ArrayList<String>();
		c2.add("yello");
		c2.add("green");
		
		System.out.println("original c1" +c1);
		
		ArrayList<String> c3= new ArrayList<String>();
		
		List<String> l= c1.subList(0, 2);
		System.out.println(l);
		
		
		for(String c4:c1)
		{
			c3.add(c2.contains(c4)? "yes": "no");
			System.out.println(c3);
		}
		
		

	}

}
