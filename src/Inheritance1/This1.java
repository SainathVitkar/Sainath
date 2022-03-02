package Inheritance1;

public class This1 
{
	public This1()
	{
		System.out.println("Default Constructor");
	}
	public This1(String a)
	{
		this();
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		This1 t=new This1("Parameterised Constructor");
		
	}

}
