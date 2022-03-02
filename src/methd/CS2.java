package methd;

public class CS2 
{
	public CS2()
	{
		System.out.println("Constructor");
	}
	public void h2()
	{
		System.out.println("Method");
	}
	{
		System.out.println("non static");
	}
	static
	{
		System.out.println("Static");
	}
public static void main(String[]args)
{
	CS2 a=new CS2();
	a.h2();
}
	
}
