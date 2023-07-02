import CO4Q1.graphics.circle;
import CO4Q1.graphics.Rectangle;
import CO4Q1.graphics.Square;
import CO4Q1.graphics.Triangle;
import java.util.*;
import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int choice;
		circle obj1=new circle();
		Rectangle obj2=new Rectangle();
		Square obj3=new Square();
		Triangle obj4=new Triangle();
		System.out.println("choose any 1) CIRCLE 2) RECTANGLE 3) SQUARE 4) TRIANGLE ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			obj1.area();
			break;
			case 2:
			obj2.area();
			break;
			case 3:
			obj3.area();
			break;
			case 4:
			obj4.area();
			break;
			default:
			break;
		}
	}
}

		