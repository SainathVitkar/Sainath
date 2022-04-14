package methd;

public class ABC 
{
	String a="Student Name";
	int b=10;
		
	public void testmethod() 							//method 
	{
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) 					//main method
	{
		ABC sainath=new ABC(); 									//object
		sainath.testmethod();  //method called
		
		
	}


}
