package windowmanagement;

import java.util.*;
public class Set_Java {
	
	public static void main(String[]args) {
		//set holds unique elements not duplicate, no final size, no index
		Set<String>  s = new HashSet<String>();
		System.out.println("Size= "+s.size());
		s.add("Bangladesh");
		s.add("USA");
		s.add("Japan");
		s.add("Japan");
		System.out.println("Size= "+s.size());
		//System.out.println(s.get(0));
		Iterator<String> it = s.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
				
		
	}

}
