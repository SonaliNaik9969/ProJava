package static_poly;
//multiple constructors in same class with diff. parameters.

class Rectangle
{
	private int l,b;
	private int area;
	public Rectangle()
	{
		l=b=10;
	}
	public Rectangle(int x)
	{
		l=b=x;
	}
	public Rectangle(int x, int y)
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

public class Construct_overloading {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5);
		Rectangle r3 = new Rectangle(4,3);
		r1.calculate();
		r1.display();
		r2.calculate();
		r2.display();
		r3.calculate();
		r3.display();
	}
}
