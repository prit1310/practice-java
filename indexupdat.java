import java.util.*;
public class indexupdat
{
	public static void main(String[] args) {
	    Scanner s1 = new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str = s1.nextLine();
	    System.out.println("Enter index:");
	    int index = s1.nextInt();
	    System.out.println("Enter a character:");
	    char c = s1.next().charAt(0);
	    if(index>=0 && index<str.length())
	    {
	        char c1[] = str.toCharArray();
	        c1[index]=c;
	        String newstr = new String(c1);
	        System.out.println("original:"+str);
	        System.out.println("updated:"+newstr);
	    }
	    else
	        System.out.println("index out of bound");
	}
}
