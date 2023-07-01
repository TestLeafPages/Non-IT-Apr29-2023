package week7.day1;

//final class -icannot inhert with other class
public class LearnFinal {

	final int x=10;
	
	public void name(int y) {
		
		System.out.println("TestLeaf");
		System.out.println(x+y);
		
		
	}
	
	
	public final int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		
		LearnFinal lf= new LearnFinal();
		lf.name(7);
		
		System.out.println(lf.add(5, 7));
	}

}
