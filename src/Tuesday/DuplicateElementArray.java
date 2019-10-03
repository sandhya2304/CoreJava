package Tuesday;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray {

	public static void main(String[] args)
	{
		String[] duplicate = {"java","mena","mona","java"};
		Set nonDuplicate =new HashSet();
	    Set Duplicate =new HashSet();
	    
	    for(String string:duplicate)
	    {
	    	if(!nonDuplicate.contains(string))
	    	{
	    		nonDuplicate.add(string);
	    	}else
	    	{
	    		Duplicate.add(string);
	    	}
	    }
	    
     System.out.println(Duplicate);
	}

}
