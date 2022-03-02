package Polymorphism1;

public class P1 
{
	public void F1(String a)
	{
		System.out.println("P1 class string method="+a);
		System.out.println("Github");
	}
	public void F1(int a)
	{
		System.out.println("P1 class int method ="+a);
	}

	public static void main(String[] args) 
	{
		P1 p=new P1();
		p.F1(10);
		

	}

}
