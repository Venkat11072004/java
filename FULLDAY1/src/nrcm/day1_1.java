package nrcm;

public class day1_1 {
	int a=10,b=20;
	static int c=30,d=40;
	void and() {
		System.out.println((a<b)&&(a>b));
	}
	void or() {
		System.out.println((c<d)||(c>d));
	}
	void not() {
		int e=10,f=20;
		System.out.println(!(e>f));
	}
	public static void main(String[] args) {
		day1_1 d1=new day1_1();
		d1.and();
		d1.or();
		d1.not();

	}

}
