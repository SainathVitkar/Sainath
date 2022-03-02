package Inheritance1;

public class C extends B
{
	public void M5()
	{
		System.out.println("M5___C");
	}
	
	public static void main(String[] args) 
	{

	C b=new C();
	b.M1();
	b.M2();
	b.M3();
	b.M4();
	b.M5();
	
	}
}
