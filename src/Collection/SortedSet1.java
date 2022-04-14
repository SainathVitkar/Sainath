package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 
{
	public static void main(String[] args) 
	{
		SortedSet a=new TreeSet();
		a.add("Bajaj");
		a.add("Honda");
		a.add("Suzuki");
		a.add("Yamaha");
		
		System.out.println(a.first());
		System.out.println(a.headSet("Yamaha"));//upper details will be execute
		System.out.println(a.tailSet("Bajaj")); //Below details will be execute with mentioned details
		System.out.println(a.last());
		System.out.println(a.subSet("Bajaj", "Suzuki"));
	}

}
