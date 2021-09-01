package single_Inheritance;

import java.util.Scanner;
//one class extends another class 
class Test
{
	protected int a,b;
	public void read(int x, int y)
	{
		a=x;
		b=y;
	}
}

class Subtract extends Test
{
	private int sub;
	public void subtract()
	{
		sub=a-b;
	}
	public void display()
	{
		System.out.println("Subtraction of two numbers : "+sub);
	}
}

public class Single_Sub {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		Subtract sub1 = new Subtract();
		sub1.read(x, y);
		sub1.subtract();
		sub1.display();
		
	}

}
