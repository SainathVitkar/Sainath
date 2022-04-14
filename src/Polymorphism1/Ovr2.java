package Polymorphism1;

public class Ovr2 extends Ovr1
{
	public void k1(int b)
	{
		super.k1(500);
		System.out.println("2nd class method= "+b);
	}
	public void k1(boolean f)
	{
		System.out.println("2nd class boolean"+f);
	}


}
