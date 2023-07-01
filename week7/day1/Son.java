package week7.day1;

public class Son extends Parent {

	public void phone() {
		System.out.println("iphone 14");
		super.phone();
	}
	public static void main(String[] args) {
		Son lo= new Son();
		lo.phone();
	}
}
