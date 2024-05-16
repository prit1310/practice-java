class removeDuplicate
{
	public static int removeDup(int arr[])
	{
		if(arr.length == 0)
		return 0;

		int uniqueNum = 0;
		
		for(int i=0 ; i<arr.length -1 ; i++)
		{
			if(arr[i] != arr[uniqueNum])
			{
				uniqueNum++;
				arr[uniqueNum] = arr[i];
			}
		}
		return uniqueNum +1;
	}
	public static void main(String args[])
	{
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int result = removeDup(arr);
		for(int i=0 ; i<result ; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
}