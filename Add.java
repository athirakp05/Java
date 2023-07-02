class Add
{
int real;
int img;
Add(int x,int y)
{
	this.real=x;
	this.img=y;
}
void display()
{
	System.out.println(real +"+" + "i" +img);
}
void addc(Add n,Add m)
{
	int a,b;
	a=n.real+m.real;
	b=n.img+m.img;
	System.out.println("Sum of two complex numbers is:"+"\n"+a+"+"+"i"+b);
}
public static void main(String[] args)
{
	Add n=new Add(3,5);
	Add m=new Add(2,4);
	n.display();
	m.display();
	n.addc(n,m);
}
}