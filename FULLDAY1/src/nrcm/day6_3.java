package nrcm;

public class day6_3 {
	void show() {
		System.out.println("Hi....");
	}
	class Nayak{
		void print() {
			System.out.println("Hello....");
		}
	}
	public static void main(String[] args) {
		day6_3 d1=new day6_3();
		d1.show();
		day6_3.Nayak n1=new day6_3().new Nayak();
		n1.print();
	}
}
