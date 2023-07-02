import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=in.nextInt();
		int i;
		for(i=2;i<num;i++)
		{
		if(num%2!=0)
		{
		       System.out.println("prime number");
		}
	    else
		{
			   System.out.println("Not prime number");
		}

		}
	}
}