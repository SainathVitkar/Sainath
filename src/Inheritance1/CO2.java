package Inheritance1;

public class CO2 extends Hyat
{
	public void Room2()
	{
		System.out.println("CO2 Method");
	}
	public CO2()
	{
		System.out.println("CO2 Constructor");
	}
	public static void main(String[] args) 
	{
	CO2 c=new CO2();
	c.Room();
	c.Room1();
	c.Room2();
	}
}
