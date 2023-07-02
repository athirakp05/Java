public class complex
{
int real;
int imag;
public complex (int r,int img)
{
this.real=r;
this.imag=img;
}
public void disp()
{
System.out.println("complex numbers are:"+real+"+"+imag);
}
public void add(complex x, complex y)
{
	complex z=new complex(0,0);
	z.real=x.real+y.real;
	z.imag=x.imag+y.imag;
}

public static void main(String args[])
{
	complex c1=new complex(2,6);
	complex c2=new complex(3,7);
	c1.disp();
	c2.disp();
}
}