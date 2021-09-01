package single_Inheritance;

import java.util.Scanner;
//one class extends another class 
class Data
{
	protected int a,b;
	public void read(int x, int y)
	{
		a=x;
		b=y;
	}
}

class Sum extends Data
{
	private int sum;
	public void add()
	{
		sum = a+b;
	}
	public void display()
	{
		System.out.println("Summition of two numbers : "+sum);
	}
}

public class Single_Add {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		x = sc.nextInt();
		y = sc.nextInt();
		Sum s1 = new Sum();
		s1.read(x, y);
		s1.add();
		s1.display();
		
	}

}
