package Polymorphism1;

public class Ovr3 extends Ovr2
{
	public void k1(int c)
	{
		super.k1(30);
		System.out.println("3rd class method = "+c);
	}

	
	
	public static void main(String[] args) 
	{
		Ovr1 h=new Ovr3();
		h.k1(10);
		
	}

}
