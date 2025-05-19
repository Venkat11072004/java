package nrcm;

public class day1_3 {
	int s=4;
	static int l=10,b=20,r=3;
	void circ() {
		System.out.println(3.14*r*r);
	}
	static void rect() {
		System.out.println(l*b);
	}
	void square() {
		System.out.println(s*s);
	}
	static void tri() {
		int b=5,h=7;
		System.out.println(0.5*b*h);
	}

	public static void main(String[] args) {
		day1_3 d1=new day1_3();
		d1.circ();
		rect();
		d1.square();
		tri();
	}

}