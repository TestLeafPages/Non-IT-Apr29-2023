package week7.day1;

public class LearnConstructor {

	int x;
	String name;
	
	//constructor overloading
	
	public  LearnConstructor() { //default constructor or no agrs
		System.out.println("Default Constructors");
		
		 x=2023; name="TestLeaf";
		 
	}
//	
//	public LearnConstructor(int age,String stname ) {
//		System.out.println("parameterzited constructor");
//		
//		x=age;
//		name=stname;
//	}
	
	public LearnConstructor(int x,String name ) {
		this();
		System.out.println("parameterzited constructor");
		
		System.out.println(this.x=x);
		System.out.println(this.name=name);
		
	}
	
	public LearnConstructor(String companyName) {
		
		this(27,"Dilip");
		System.out.println(companyName);
	}
	
	
	public static void main(String[] args) {
		LearnConstructor lc=new LearnConstructor();
		LearnConstructor lc1=new LearnConstructor(27,"Dilip");
		/*
		 * System.out.println("Default constructor :"+lc.x);
		 * System.out.println("Default constructor :"+lc.name);
		 */
		
		System.out.println("para constructor :"+lc1.x);
		System.out.println("para constructor :"+lc1.name);
		
		LearnConstructor lc2=new LearnConstructor(25,"Dilip");
		System.out.println("para1 constructor :"+lc2.x);
		System.out.println("para1 constructor :"+lc2.name);
		
		System.out.println("************************************************");
		
		//using this keyword
		LearnConstructor lc3=new LearnConstructor("Testleaf");
		
		
	}
}
