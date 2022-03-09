package Exception;

public class Exp1 {

	public static void main(String[] args) 
	{
		System.out.println("In Main");
		
		String a="Java";
		try
		{
		int b=Integer.parseInt(a);
		
		System.out.println(b);
		}
		catch(NumberFormatException c)
		{
			System.out.println(c);
			System.out.println("Queen");
		}
		catch(Exception m)
		{
			System.out.println(m);
			System.out.println("King");
		}
		
		System.out.println("Out Main");

	}

}
