package Exception;

public class KKK 
{
	public static void main(String[] args) 
	{
		System.out.println("In main"); //1st
		
		try
		{
		int a=10/0;
		
		System.out.println(a); //2nd
		} 
		catch(Exception b)
		{
			System.out.println(b);
		}
		
		System.out.println("Out main"); //3rd
		
	}

}
