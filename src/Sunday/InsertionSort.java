package Sunday;

public class InsertionSort {

	public static void main(String[] args) 
	{
		
		 int arry[]= {9,6,3,7,1,2,3};
		 
		 int temp,j;
		 
		 
		 for(int i=1;i<arry.length;i++)
		 {
			 temp=arry[i];
		      j=i;
		      while(j > 0 && arry[j-1]>temp )
		      {
		    	  arry[j] = arry[j-1];
		    	  j=j-1;
		      }
		      arry[j]= temp;
			 
		 }
		 
		 for(int hum:arry)
		 {
			 System.out.println(hum);
		 }
		 
		
	}

}
