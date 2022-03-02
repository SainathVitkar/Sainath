package Inheritance1;

public class Super2 extends Super1
{
	int a=222;
	Super2()
	{
		System.out.println(a);
		System.out.println("2nd class----Constructor");
	}
	
	public void R1()
	{
		super.R1();
		System.out.println(super.a);
		//System.out.println("2nd class-----Method");
	}

}
