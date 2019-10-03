package Monday;

public class QuickSortDemo {

	public static void main(String[] args)
	{
		int arry[]= {5,3,9,12,90,36,14,7,1};

		int leng = arry.length;
		
		QuickSortDemo qq = new QuickSortDemo();
		qq.qickSortRecursion(arry, 0,leng-1);
		qq.printAtty(arry);
	}
	
	public int partition(int arr[],int low,int high)
	{
		int pivot = arr[(low+high)/2];
		
		//put pivot left  side small and right side large
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low ++;
				high --;
			}
		}
		return low;
	}
	
	public void qickSortRecursion(int arr[],int low,int high)
	{
		int pi = partition(arr,low,high);
		if(low < pi-1)
		{
			//leg=ft hand side
			qickSortRecursion(arr,low,pi-1);
		}
		if(pi < high)
		{
			//right hand side
			qickSortRecursion(arr,pi,high);
		}
	}
	
	public static void printAtty(int arr[])
	{
		for(int a:arr)
		{
			System.out.println(a+" ");
		}
	}

}
