package Exception;

public class throw2 
{	
	public static void Y1(int age) throws NehaException
	{
		System.out.println("Y1 method"); 
		
		if(age<10)
		{	
			throw new NehaException();
		}
		else
		{
			System.out.println("not eligible for class");
			
		}
		
	}
	public static void Y2() 
	{
		
	}
public static void main(String[] args) 
{
	try 
	{
		throw2.Y1(9);
	} 
	catch (NehaException e) 
	{
		System.out.println(e);
	}
		
	
}
}
