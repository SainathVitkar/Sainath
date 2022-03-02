package Inheritance1;

public class Hyat extends JW
{
	public void Room1()
	{
		System.out.println("Hyat Method");
	}
	public Hyat()
	{
		System.out.println("Hyat  Constructor");
	}
	public static void main(String[] args) 
	{
		Hyat h=new Hyat();
		h.Room();
		h.Room1();
	
	}
}
