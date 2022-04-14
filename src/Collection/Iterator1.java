package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) 
	{
		List a=new LinkedList();
		
		a.add(54);
		a.add(98);
		//a.add("java");
		a.add(12);
		a.add(8);
		a.add(4);
		
		Iterator itr=a.iterator();
		while(itr.hasNext()) // has next is the method of boolean value
		{
			int x=(int)itr.next();
			System.out.println(x);
		}

	}

}
