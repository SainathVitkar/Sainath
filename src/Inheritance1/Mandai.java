package Inheritance1;

public class Mandai extends Flipcart
{
	int c=888;
	int d=999;
	public Mandai()
	{
		System.out.println("Mandai___C");
	}
	public void A3()
	{
		System.out.println("Mandai___M");
	}
	public static void main(String[] args) 
	{
		Amazon m=new Flipcart();
		//Flipcart c=new Mandai();
		//c.A1();
		//System.out.println(c.a);
		//System.out.println(c.b);
		System.out.println(m.a);
		//Mandai b=new Mandai();
		//System.out.println(b.c);
		//b.A3();
		m.A1();
		
	}

}
