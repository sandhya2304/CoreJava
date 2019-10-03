package Sunday;

public class SelectionsSortDemo {

	public static void main(String[] args) 
	{
		 int arry[]= {9,6,3,7,1,2,3};
		 
		 int min;
		 
		 int temp;
		 
		 for(int i =0;i<arry.length;i++)
		 {
			 min = i;
			 for(int j=i+1;j<arry.length;j++)
			 {
				 if(arry[j]<arry[min])
				 {
					 min = j;
				 }
			 }
			 temp = arry[i];
			 arry[i]= arry[min];
			 arry[min] = temp;
			 
		 }
		 
		 for(int hum:arry)
		 {
			 System.out.println(hum);
		 }
		 
		 

	}

}
