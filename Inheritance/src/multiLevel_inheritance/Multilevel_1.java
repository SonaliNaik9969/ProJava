package multiLevel_inheritance;

import java.util.Scanner;
//class can inherit from a derived class. 
//Hence, the derived class becomes the base class for the new class.
class person
{
	protected int id;
	String name;
}

class Account extends person
{
	protected float pay;
}

class Admin extends Account
{
	private int exp;
	public void read(int i, String s , float p, int e)
	{
		
		id=i;
		name=s;
		pay=p;
		exp=e;
	}
	public void display()
	{
		System.out.println("ID :" +id+ "\nName :" +name+ "\nPay :" +pay+ "\nExp :" +exp);
	}
}

public class Multilevel_1 {
	public static void main(String[] args) {
		float pay;
		int i,e;
		String str1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,pay and exp : ");
		i = sc.nextInt();
		str1 = sc.next();
		pay = sc.nextFloat();
		e = sc.nextInt();
		Admin a1 = new Admin();
		a1.read(i, str1, pay, e);
		a1.display();
		
	}

}
