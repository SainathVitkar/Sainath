package methd;

public class Maths 
{
	public void m1()
	{
		int a=50;
		System.out.println("Number of Class ="+a);
		int b=1000;
		System.out.println("Number of Students in School ="+b);
		int c=b/a;
		System.out.println("Number of Students in one class ="+c);
	}
	public static void main(String[]args)
	{
		System.out.println("Modern Highschool Details");
		
		Maths N=new Maths();
		N.m1();
		
		System.out.println("Thanks");
	}
}
