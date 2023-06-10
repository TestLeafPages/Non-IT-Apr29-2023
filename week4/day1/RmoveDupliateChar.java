package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RmoveDupliateChar {

	public static void main(String[] args) {
		String companyName="testleaf";
		//t,e
		
		char[] ch = companyName.toCharArray();
		
		//syntax
		
		Set<Character>unique=new LinkedHashSet<Character>();
		
		for (Character character : ch) {
			unique.add(character);
		}
		System.out.println(unique);
		
		
	}

}
