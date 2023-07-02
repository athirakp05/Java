//Fibonacci series in Java
import java.util.*;
class Fibonacci
{
    public static void main(String[] args)
    {
        int i,n1=0,n2=1,n3;
        System.out.println("Enter the limit");
        Scanner f=new Scanner(System.in);
        int a=f.nextInt();
        System.out.println(" "+n1+" \n"+" "+n2);
        for(i=2;i<a;i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}