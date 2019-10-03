package Friday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListDemo {

	public static void main(String[] args) 
	{
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		System.out.println("before reverse"+list);
        Collections.reverse(list);
		System.out.println("after reverse"+list);
		
	}

}
