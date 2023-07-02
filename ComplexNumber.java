class ComplexNumber {
    int real, image;
    public ComplexNumber(int r,int i)
    {
        this.real = r;
        this.image = i;
    }
    ComplexNumber(int b)
    {
        this.real=b;
        this.image=b;
    } 
    public void showC()
    {
        System.out.print(this.real + " +" + this.image+"i");
    }
    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)  // to access the object without function
    {
        ComplexNumber comp = new ComplexNumber(0, 0);
        comp.real = n1.real + n2.real;
        comp.image = n1.image + n2.image;
        return comp;
    }
    public static void main(String arg[])
    {
        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(10);
        System.out.print("first Complex number: ");
        c1.showC();
        System.out.print("\nSecond Complex number: ");
        c2.showC();
        ComplexNumber comp = add(c1, c2);
        System.out.println("\nAddition is :");
        comp.showC();
    }
}
