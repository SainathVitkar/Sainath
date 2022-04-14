package Collection;

import java.util.LinkedList;
import java.util.List;

public class Foreach1 {

	public static void main(String[] args) 
	{
		List<Object> a=new LinkedList();
		
		a.add(54);
		a.add(98);
		a.add("java");
		a.add(12);
		a.add(8.5);
		a.add(false);
		
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
