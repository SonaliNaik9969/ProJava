package dynamic_poly;
//Data class obj d used to call display() method.
//null obj is to indicate JVM that the use of this obj is over.
//gc()[garbage collection] method of System class is called 
//given statement printed automatically.

class Data
{
	public void display(int x)
	{
		System.out.println("X :"+x);
	}
	public void finalize()
	{
		System.out.println("Finalize method of class Data");
	}
}
public class Finalize_1 {
	public static void main(String[] args) {
		Data d = new Data();
		d.display(10);
		d = null;
		System.gc();
	}

}
