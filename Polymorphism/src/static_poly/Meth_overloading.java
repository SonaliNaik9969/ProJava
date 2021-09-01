package static_poly;
//multiple methods with same name in the same class or derived class with diff. parameters.
class Area
{
	private float x,y,z;   //
	public float area(float r)
	{
		return 3.14f*r*r;
	}
	public float area(float l,float b)
	{
		return l*b;
	}
	public float area(float a,float b,float c)
	{
		float t;
		t = (a+b+c)/2;
		t = t*(t-a)*(t-b)*(t-c);
		return(float)(Math.sqrt(t));
	}
}
public class Meth_overloading {
	public static void main(String[] args) {
		Area a1 = new Area();
		System.out.println("Area of Circle :"+a1.area(10));
		System.out.println("Area of Rectangle :"+a1.area(10,10));
		System.out.println("Area of Triangle :"+a1.area(10, 10, 10));
		
		
	}
}
