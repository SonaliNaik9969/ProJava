package interface_p;

import java.util.Scanner;
//interface Data made with declaration of methods read(),calculate() and display().
//sphere and hemisphere are derived classes from interface using keyword "implements".
//derived classes overridden methods which declared in interface.
interface Data
{
	public void read(float x);
	public void calculate();
	public void display();
}
class Sphere implements Data
{
	protected float r,volume;
	public void read(float x)
	{
		r=x;
	}
	public void calculate()
	{
		volume = 3.14f*r*r*r*4/3;
	}
	public void display()
	{
		System.out.println("Volume :"+volume);
	}
}
class Hemisphere implements Data
{
	protected float r,volume;
	public void read(float x)
	{
		r=x;
	}
	public void calculate()
	{
		volume = 3.14f*r*r*r*2/3;
	}
	public void display()
	{
		System.out.println("Volume :"+volume);
	}
}
public class Interface1 {
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
