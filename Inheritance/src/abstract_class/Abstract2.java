package abstract_class;

import java.util.Scanner;
//abstract methods read() and calculate() in abstract class 
//and in sub classes circle,rectangle,square and triangle.
abstract class Data1
{
	protected float r,l,b,area;
	public abstract void calculate();
	public void display()
	{
		System.out.println("Area :"+area);
	}
}
class Circle extends Data1
{
	public void read(float x)
	{
		r=x;
		
	}
	public void calculate()
	{
		area = 3.14f*r*r;
	}
}
class Rectangle extends Data1
{
	public void read(float x, float y)
	{
		l=x;
		b=y;
		
	}
	public void calculate()
	{
		area = l*b;
	}
}
class Square extends Data1
{
	public void read(float x)
	{
		l=x;
	}
	public void calculate()
	{
		area = l*l;
	}
}
class Triangle extends Data1
{
	public void read(float x, float y)
	{
		l=x;
		b=y;
		
	}
	public void calculate()
	{
		area = 0.5f*l*b;
	}
}
public class Abstract2 {
	public static void main(String[] args) {
		float x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Enter the radius :");
		x = sc.nextFloat();
		Circle c = new Circle();
		c.read(x);
		c.calculate();
		c.display();
		
		System.out.println("Rectangle");
		System.out.println("Enter the length and breadth :");
		x = sc.nextFloat();
		y = sc.nextFloat();
		Rectangle r = new Rectangle();
		r.read(x,y);
		r.calculate();
		r.display();
		
		System.out.println("Square");
		System.out.println("Enter the length :");
		x = sc.nextFloat();
		Square s = new Square();
		s.read(x);
		s.calculate();
		s.display();
		
		System.out.println("Triangle");
		System.out.println("Enter the length and breadth :");
		x = sc.nextFloat();
		y = sc.nextFloat();
		Triangle t = new Triangle();
		t.read(x,y);
		t.calculate();
		t.display();
		
	}
	

}
