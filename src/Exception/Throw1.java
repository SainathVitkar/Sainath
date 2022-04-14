package Exception;

public class Throw1 
{
	public static void m1(int age) throws AgeInvalidException
	{
		if(age>17)
		{
			throw new AgeInvalidException();
			
		}
		else
		{
			System.out.println("Eligible for vote");
		}
		
}
	
	public static void main(String[] args) 
	{
		try
		{
			Throw1.m1(19);
		}
		catch(AgeInvalidException d)
		{
			System.out.println(d);
		}
		
		
		
	}

}
