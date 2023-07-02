import CO4Q2.operations.Add;
import CO4Q2.operations.Subtract;
import CO4Q2.operations.Divide;
import CO4Q2.operations.Multiply;
import java.util.Scanner;
public class driver1
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first Number:");
int a = sc.nextInt();
System.out.println("Enter the Second Number:");
int b=sc.nextInt();
Add obj1=new Add();
obj1.cal(a,b);
Subtract obj2=new Subtract();
obj2.cal(a,b);
Divide obj3=new Divide();
obj3.cal(a,b);
Multiply obj4=new Multiply();
obj4.cal(a,b);
		}
}


