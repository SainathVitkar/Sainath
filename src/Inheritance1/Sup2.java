package Inheritance1;

public class Sup2 extends Sup1
{
	int a=20;
	Sup2()
	{
		System.out.println("Sup2----C");
	}
	public void S1()
	{
		super.S1();
		System.out.println("Sup2----M");
	}

}
