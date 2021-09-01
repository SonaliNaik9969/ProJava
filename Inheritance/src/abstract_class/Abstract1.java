package abstract_class;

import java.util.Scanner;
//abstract methods read() and calculate() in abstract class 
//and in sub classes sphere and hemisphere.
abstract class Data
{
	protected float r,volume;
	public void read(float x)
	{
		r=x;
	}
	public abstract void calculate();
	public void display()
	{
		System.out.println("Volume :"+volume);
	}
}
class Sphere extends Data
{
	public void calculate()
	{
		volume = 3.14f*r*r*r*4/3;
	}
	
}
class Hemisphere extends Data
{
	public void calculate()
	{
		volume = 3.14f*r*r*r*2/3;
	}
}
public class Abstract1 {
	public static void main(String[] args) {
		float x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		x = sc.nextFloat();
		Sphere s = new Sphere();
		s.read(x);
		s.calculate();
		System.out.println("Sphere");
		s.display();
		
		Hemisphere h = new Hemisphere();
		h.read(x);
		h.calculate();
		System.out.println("Hemisphere");
		h.display();
	}

}
