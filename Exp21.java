import java.util.Scanner;
public class Exp21
{
public static void main(String[] args)
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
mul obj1=new mul();
obj1.start();
prime obj2=new prime(number);
obj2.start();
}
public static class mul extends Thread
{
	public void run()
	{
		System.out.println("\n");
		for(int i=0;i<11;i++)
		{
			System.out.println("5*"+i+"="+5*i);
		}
}
}
public static class prime extends Thread
{
	int num;
	public prime(int n)
	{
		this.num=n;
	}
	public void run()
	{
		int x,y,flg;
		System.out.println("All the prime numbers within 1 and "+ num +"are:");
		for(x=1;x<num;x++)
		{
			if(x==1 || x==0)
				continue;
			flg = 1;
			for(y = 2;y <= x / 2; ++y)
			{
				if(x % y ==0)
				{
					flg=0;
					break;
				}
			}
			if(flg==1)
				System.out.println("\n prime number="+x+"");
		}
	}
}
}

