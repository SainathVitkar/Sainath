package Polymorphism1;

public class P3 extends P2
{
	public void F1()
	{
		System.out.println("P3 method");
	}

	public static void main(String[] args) 
	{
		P3 k=new P3();
		k.F1(10.5);
		k.F1(10);
		k.F1("Ganesh");
		k.F1();
		k.F1(true);
		

	}

}
