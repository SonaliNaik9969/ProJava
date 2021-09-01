package interface_p;

import java.util.Scanner;
//interface Data made with declaration of methods read(),calculate() and display().
//square,circle,rectangle and triangle are derived classes from interface using keyword "implements".
//derived classes overridden methods which declared in interface.
interface Data1
{
	public void calculate();
	public void display();
}
class Square implements Data1
{
	protected float side,area;
	public void read(float x)
	{
		side=x;
	}
	public void calculate()
	{
		area = side* side;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
}
class Circle implements Data1
{
	protected float r,area;
	public void read(float a)
	{
		r=a;
	}
	public void calculate()
	{
		area = 3.14f*r*r;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
}
class Rectangle implements Data1
{
	protected float l,b,area;
	public void read(float x, float y)
	{
		l=x;
		b=y;
	}
	public void calculate()
	{
		area = l*b;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
}
class Triangle implements Data1
{
	protected float l,b,area;
	public void read(float x, float y)
	{
		l=x;
		b=y;
	}
	public void calculate()
	{
		area = 0.5f*l*b;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
	
}
public class Interface_2 {
	public static void main(String[] args) {
		float x,y,a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Square");
		System.out.println("Enter the side :");
		a = sc.nextFloat();
		Square s1 = new Square();
		s1.read(a);
		s1.calculate();
		s1.display();
		
		System.out.println("Circle");
		System.out.println("Enter the radius :");
		x = sc.nextFloat();
		Circle c1 = new Circle();
		c1.read(x);
		c1.calculate();
		c1.display();
		
		System.out.println("Rectangle");
		System.out.println("Enter the length and breadth :");
		x = sc.nextFloat();
		y = sc.nextFloat();
		Rectangle r1 = new Rectangle();
		r1.read(x,y);
		r1.calculate();
		r1.display();
		
		System.out.println("Triangle");
		System.out.println("Enter the length and breadth :");
		x = sc.nextFloat();
		y = sc.nextFloat();
		Triangle t1 = new Triangle();
		t1.read(x,y);
		t1.calculate();
		t1.display();
	}
}
