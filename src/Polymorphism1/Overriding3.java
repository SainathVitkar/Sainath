package Polymorphism1;

public class Overriding3 extends Overriding2
{
	public void O1(int b)
	{
		super.O1(b);
		System.out.println("3rd class O1 method = "+b);
	}
	public static void main(String[] args) 
	{
		Overriding3 o=new Overriding3();
			o.O1(200);
		
	}

}
