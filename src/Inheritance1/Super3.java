package Inheritance1;

public class Super3 extends Super2
{
	
	Super3()
	{
		System.out.println(a);
		System.out.println("3rd class----Constructor");
	}
	
	public void R1()
	{
		super.R1();
		System.out.println(super.a);
		System.out.println("3rd class-----Method");
	}
	public static void main(String[] args) 
	{
		Super3 s=new Super3();
		s.R1();
	}
}
