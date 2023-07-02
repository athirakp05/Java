class product
{
int pcode;
String pname;
int pprice;
product(int c,String n,int p)
{
pcode=c;
pname=n;
pprice=p;
}
void displayprice()
{
System.out.println("Products are:"+pcode+ " "+pname +"  "+pprice);
}
public static void main(String args[])
{
	product p1=new product(123,"product1",3000);
	product p2=new product(456,"product2",5000);
	product p3=new product(789,"product3",2000);
	p1.displayprice();
	p2.displayprice();
	p3.displayprice();
	if(p1.pprice<p2.pprice & p1.pprice<p3.pprice)
	{
		System.out.println("Product with low cost is:"+p1.pprice);
	}
	else if(p2.pprice<p3.pprice & p2.pprice <p3.pprice)
	{
			System.out.println("Product with lowest price is:"+p2.pprice);
	
	}
	else
	{
				System.out.println("Product with lowest price is:"+p3.pprice);
	}
}

}