package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 
{
	

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(5, "Sainath");
		m.put(20, "Priya");
		m.put(30, "Neha");
		m.put(100, "Shreyas");
		
		Set Keys=m.keySet();
		//System.out.println(Keys);
		
		Iterator itr=Keys.iterator();
		while(itr.hasNext());
		{
			int i=(int) itr.next();
			System.out.println(i);
			
			String d=(String) m.get(i);
			System.out.println(d);
		}
		
	}

}
