package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> mentors=new LinkedHashSet<String>();
		
	mentors.add("gokul");
	mentors.add("vinoth");
	mentors.add("ranjini");
	mentors.add("dilip");
	mentors.add("gokul");
	
	System.out.println(mentors);
	
	//foreach loop
	for (String name : mentors) {
		
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
	//if you want get one data convert set into list
	
	List<String>mentor= new ArrayList<String>(mentors);
	
	System.out.println(mentor);
	
	String string = mentor.get(1);
	
	System.out.println(string);

	}

}
