package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveNum {

	public static void main(String[] args) {
		
		int[] num= {2,4,5,2,6,8,9,4,1,7};
		//2,4
		
		Set<Integer>unique= new LinkedHashSet<Integer>();
		
		Set<Integer>duplicate= new LinkedHashSet<Integer>();

		for (Integer integer : num) {
			
			if(!unique.add(integer)) {
				
				duplicate.add(integer);
			}
			
		}
		System.out.println(unique);
		
		System.out.println(duplicate);
	}

}
