package static_poly;
//multiple methods with same name in the same class or derived class with diff. parameters.
class Volume
{
	private int x,y,z;   //
	public float volume(float l)
	{
		return l*l*l;
	}
	public float volume(float r,float h)
	{
		return 3.14f*r*r*h;
	}
	public float volume(float l,float b,float h)
	{
		return l*b*h;
	}
}
public class Meth_overloading1 {

	public static void main(String[] args) {
		Volume v = new Volume();
		System.out.println("Volume of Cube :"+v.volume(10));
		System.out.println("Volume of Cylinder :"+v.volume(10,10));
		System.out.println("Volume of Cuboid :"+v.volume(10,10,10));

	}

}
