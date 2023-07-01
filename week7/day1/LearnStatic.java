package week7.day1;

public class LearnStatic {

	int empId;
	String empName;//non-static
	static String companyName;//static 
	
	public void setData(int id,String name,String cname) {
		 empId=id;
		 empName=name;
		 companyName=cname;
		  
	}
	
	public void printData() {
		System.out.println(empId +" "+empName+" "+companyName);
	}
	
	
	//static method 
	
	public static void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	
	//static block 
	
	static {
		System.out.println("i am static block");
	}
	
	
	
	public static void main(String[] args) {
		
		//static method add();=we call directly method
		
		add(5,6);
		
		LearnStatic ls= new LearnStatic();
		ls.setData(101, "Dilip","tcs");
		ls.printData();
		
		LearnStatic ls1= new LearnStatic();
		ls1.setData(102, "Gokul", "Testleaf");
		ls1.printData();
		ls.printData();
		
		LearnStatic ls2= new LearnStatic();
		ls2.setData(103, "Vinoth", "Hcl");
		ls2.printData();
		ls.printData();
		ls1.printData();
		
		LearnStatic ls3= new LearnStatic();
		ls3.setData(104, "Ranjini", "Testleaf");
		ls3.printData();
		
		
			

		
	}

}
