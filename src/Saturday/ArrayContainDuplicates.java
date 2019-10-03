package Saturday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainDuplicates {

	public static void main(String[] args)
	{
		String[] words = {"java","php","angular"};

		List duplicateList =Arrays.asList(words);
		Set duplicateSet = new HashSet(duplicateList);
		if(duplicateList.size()!=duplicateSet.size())
		{
			System.out.println("array contains duplicates");
		}else
		{
			System.out.println("not");
		}
		
	}

}
