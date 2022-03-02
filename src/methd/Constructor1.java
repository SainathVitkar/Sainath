package methd;

public class Constructor1 
{
	public Constructor1()
	{
		System.out.println("Constructor");
	}
	
	public Constructor1(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Constructor1 A=new Constructor1();
		Constructor1 B=new Constructor1("Sainath");

	}

}
