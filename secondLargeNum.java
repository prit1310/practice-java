import java.util.*;
class secondLargeNum
{
	public static void sln(int arr[])
	{
		Arrays.sort(arr);
		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			if(arr[i] > large)
			{
				secondLarge = large;
				large = arr[i];	
			}
			else if(arr[i] < large && arr[i] > secondLarge)
			{
				secondLarge = arr[i];
			}
		}
		if(secondLarge == Integer.MIN_VALUE)
		{
			System.out.println("-1");
		}
		
		System.out.println("Large value is: "+large+" & Second large value is: "+secondLarge);
	}
	public static void main(String args[])
	{
		int arr[] = {12,35,1,10,34,1};
		sln(arr);
	}
}