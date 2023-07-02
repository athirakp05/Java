//palindrome  program
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=in.nextInt();
		int sum=0,val,temp=num;
		while(num!=0)
		{
		val=num%10;
		sum=(sum*10)+val;
		num=num/10;
		}
		if(temp==sum)
		{
		System.out.println("Plaindrom number");
		}
		else
		{
		System.out.println("NOT Plaindrom number");
		}
	}

}
		
		
		
