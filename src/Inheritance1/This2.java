package Inheritance1;

public class This2 
{
	public This2(int a)
	{
		this();
		System.out.println("Parameterised Constructor "+a);
	}
	public This2()
	{
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) 
	{
		
		This2 b=new This2(10);	
	}
	

}
