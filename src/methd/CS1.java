package methd;

public class CS1 
	
{
	
	
	public CS1()
	{
		System.out.println("Default Constructor =");
	}
	public CS1(String a)
	{
		System.out.println("Parameterise Constructor =");
	}
	
	public void MI(double a)
	{
		System.out.println("Method =");
	}
	{
		System.out.println("non static =");
	}
	static
	{
		System.out.println("Static =");
	}
	
	public static void main(String[]args)
	{
		CS1 a=new CS1();
		CS1 v=new CS1("Coding");
		a.MI(2.5);
	}
}
