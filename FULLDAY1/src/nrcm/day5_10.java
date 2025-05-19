package nrcm;
class sample2{
	void print() {
		System.out.println("Super undhi super keyword");
	}
}
public class day5_10 extends sample2 {
	void show() {
		super.print();
	}

	public static void main(String[] args) {
		day5_10 d1=new day5_10();
		d1.show();
	}
}