package Exception;

public class Throws1 
{
	public static void m1() throws Exception
	{
		String a="Java";
		
		int b=Integer.parseInt(a);
		
		System.out.println(b);
		System.out.println("M1 method");
	}
	public static void m2() throws Exception
	{
		Throws1.m1(); 
		System.out.println("M2 method");
	}
	
	
	public static void main(String[] args) 
	{
		try {
			Throws1.m2();
		} 
		catch (Exception e) 
		{
		
			System.out.println(e);
		} 
		System.out.println("Main method");
	}

}
