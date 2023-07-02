//create a class student with instance variable roll no and name .write  a record  called insert record
// to read data to corresponding instances of student namely s1 and s2
//Write another method called display information to display all the data related to students s1 and s2

class Student
{
int rollno;
String name;
void insertRecord(int r , String n)
{
	rollno=r;
	name=n;
}
void displayInformation()
{
	System.out.println(rollno+" "+name);
}
void display()
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(111,'Karan');
s1.insertRecord(222,'Aryan');
s1.displayInformation();
s2.displayInformation();
}
}
