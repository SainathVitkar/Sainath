package Encapsulation;

public class Setter_getter1 
{
	private String color;
	public void setcolor(String c)
	{
		this.color=c;
	}
	
	public String getcolor()
	{
		return color;
	}
	public static void main(String[]args)
	{
		Setter_getter1 b=new Setter_getter1();
		b.setcolor("Blue");
		System.out.println(b.getcolor());
	}
	

}
