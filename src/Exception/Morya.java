package Exception;

public class Morya 
{
	public static void M1()throws Exception
	{
		System.out.println("M1 of morya");
		int a=10/0;
		System.out.println(a);
	}
	public static void M2() throws Exception
	{
		System.out.println("M2 of morya");
		Morya.M1();
	}
	public static void M3() throws Exception
	{
		System.out.println("M3 of morya");
		Morya.M2();
		
	}
	public static void main(String[] args)throws Exception
	{
		Morya.M3();
	}

}
