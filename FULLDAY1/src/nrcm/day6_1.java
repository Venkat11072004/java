package nrcm;
class sample6_1 {
/*final class sample6_1{*/ 
	//Final variable
	/*void show() {
		int a=23;
		System.out.println(a);
		a=45;
		System.out.println(a);
	}*/
	/*void show1() {
		final int a=35;
		System.out.println(a);
		a=45;
		System.out.println(a);
	}*/
	/*void show() {
		System.out.println("Hi");
	}*/
	/*final void show() {
		System.out.println("Hi");
	}*/
	void show() {
		System.out.println("Hi");
	}
}
	public class day6_1 extends sample6_1{
	void show() {
		int a=23;
		System.out.println(a);
		a=45;
		System.out.println(a);
	}
	public static void main(String[] args) {
		day6_1 d1=new day6_1();
		d1.show();
	}

}
