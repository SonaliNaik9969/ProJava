package dynamic_poly;

//ref obj given to child class hence child class display() method is called.
//ref obj given to parent class hence parent class display() method is called.
class Parent
{
	public void display(int x)
	{
		System.out.println("X :"+x); 
	}
}
class Child extends Parent
{
	public void display(int y)
	{
		System.out.println("Y :"+y);
	}
	
}
public class Dynamic_Dispatch {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		Parent ref;
		ref = p;
		ref.display(15);
		ref = c;
		ref.display(10);
		
	}

}
