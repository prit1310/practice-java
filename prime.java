import java.util.*;
class prime
{
	public static void main (String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s1.nextInt();
		int flag=0;
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("It is a prime  number");
		if(flag==1)
			System.out.println("It is not a prime number");
	}
}