import CO4Q3.credentialexception;
import java.util.Scanner;
public class Authentication
{
public static void main(String[] args)
{
String username="abcd";
String password="pqrs";
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Password");
String u2=sc.nextLine();
try
{
if((u1.equals(username))&&(u2.equals(password)))
{
System.out.println("Access Denied");
}
else
{
throw new credentialexception("invalid credentials");
}
}
catch (credentialexception e)
{
System.out.println(e.getMessage());
}
}
}