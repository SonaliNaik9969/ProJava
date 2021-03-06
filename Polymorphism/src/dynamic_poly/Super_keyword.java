package dynamic_poly;
//to access member of base class from derived class then super keyword is used.
//super(a)
//super.display(y)
class Parent1
{
	public Parent1(int a)
	{
		System.out.println("Constructor of Parent Class :"+a);
	}
	public void display(int x)
	{
		System.out.println("X :"+x);
	}
}
class Child1 extends Parent1
{
	public Child1(int a)
	{
		super(a);
		System.out.println("Constructor of Child Class :"+a);
	}
	public void display(int y)
	{
		super.display(y);
		System.out.println("Y :"+y);
	}
}
public class Super_keyword {
	public static void main(String[] args) {
		Child1 c1 = new Child1(5);
		c1.display(3);
	}
}
