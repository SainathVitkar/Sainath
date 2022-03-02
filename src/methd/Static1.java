package methd;

public class Static1 
{
	static
	{
		int a=10;
		for(;a<=20;a++)
		{	
			System.out.print(a);
		}
	}
	
	{
		for(char j='Z';j>='A';j--)
			System.out.print(j);
	}
	
public static void main(String[]args)
	{
	System.out.println();
		Static1 a=new Static1();
	}
}