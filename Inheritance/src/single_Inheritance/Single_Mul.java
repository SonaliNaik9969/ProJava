package single_Inheritance;

import java.util.Scanner;
//one class extends another class 
class Data1
{
	protected int a,b;
	public void read(int x, int y)
	{
		a=x;
		b=y;
	}
	
}

class Multi extends Data1
{
	private int mul;
	public void multiple()
	{
		mul=a*b;
	}
	public void display()
	{
		System.out.println("multiplication of two numbers : "+mul);
	}
}

public class Single_Mul {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		Multi m1 = new Multi();
		m1.read(x, y);
		m1.multiple();
		m1.display();
	}

}
