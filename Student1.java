class Student1
{
int rollno;
String name;
Student1(int r,String s)
{
	rollno=r;
	name=s;
}
void display()
{
	System.out.println(rollno+" " +name);
}
public static void main(String arg[])
{
	Student1 s1=new Student1(1,"Athira");
    Student1 s2=new Student1(2,"Aleena");
	s1.display();
	s2.display();
}	
}
