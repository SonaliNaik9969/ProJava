package multiLevel_inheritance;

import java.util.Scanner;
//class can inherit from a derived class. 
//Hence, the derived class becomes the base class for the new class.
class Data
{
	protected float r;
	public void read(float x)
	{
		r=x;
	}
}

class Area extends Data
{
	protected float area;
	public void calculate()
	{
		area=3.14f*r*r;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
}

class Volume extends Area
{
	private float volume;
	public void compute()
	{
		volume=area*r*4/3;
	}
	public void Output()
	{
		System.out.println("Volume :"+volume);
	}
}

public class Multilevel_2 {
	public static void main(String[] args) {
		
	float x;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius :");
	x = sc.nextFloat();
	Volume v1 = new Volume();
	v1.read(x);
	v1.calculate();
	v1.display();
	v1.compute();
	v1.Output();
	}
}

