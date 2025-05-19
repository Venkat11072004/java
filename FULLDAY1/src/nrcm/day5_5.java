
package nrcm;

/*public class day5_5 {
	void show() {
		System.out.println("Method overloading");
	}
	void show(int a, int b) {
		System.out.println(a+b);
	}
	void show(double c,double d) {
		System.out.println(c-d);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}
	public static void main(String[] args) {
		day5_5 d1=new day5_5();
		d1.show();
		d1.show(10, 20);
		d1.show(20.8, 11.0);
		d1.show("Venkat", "Nayak");

	}

}*/
public class day5_5 {
	public static void main() {
		System.out.println("Method overloading");
	}
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(double c,double d) {
		System.out.println(c-d);
	}
	public static void main(String s1,String s2) {
		System.out.println(s1+s2);
	}
	public static void main(String[] args) {
		day5_5 d1=new day5_5();
		d1.main();
		d1.main(10, 20);
		d1.main(20.8, 11.0);
		d1.main("Venkat", "Nayak");

	}

}
