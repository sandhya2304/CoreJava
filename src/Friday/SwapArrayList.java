package Friday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Before Swapping:"+list);
        Collections.swap(list, 0, 1);
        System.out.println("after Swapping:"+list);
		 
	}

}
