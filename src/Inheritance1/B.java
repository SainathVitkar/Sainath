package Inheritance1;

public class B extends A
{
	public void M3()
	{
		System.out.println("M3__B");
	}
	public void M4()
	{
		System.out.println("M4__B");
	}
	
	public static void main(String[] args) 
	{

	B b=new B();
	b.M1();
	b.M2();
	b.M3();
	b.M4();
	}
}
