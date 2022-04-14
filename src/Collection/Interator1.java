package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Interator1 {

	public static void main(String[] args) 
	{
		List a=new ArrayList();
		a.add(10);  /// 10
		a.add(30);  ///30
		a.add(40);  ///40 
		a.add(5);   ///5
		a.add(100);  ////100
		a.add(30);  ///30
		a.add(5);   ///5
		
		
		System.out.println("All details required= "+a); //Same all details execute
		
		Set s=new LinkedHashSet(a); //same details execute except duplicates
		System.out.println("Only Duplicates need to remove= "+s);
		
		Set v=new TreeSet(a); // accending way will be print and also duplicate will be remove
		System.out.println("Accending way details without duplicates= "+v);
		
		
		Collections.sort(a); //Duplicate will print but accending way
		System.out.println("All details required in accending way including duplicates= "+a);

	}

}
