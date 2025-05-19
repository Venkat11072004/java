package nrcm;
class Demo66{
	void show() {
		System.out.println("Hello!!!");
	}
}
public class day6_6 {
	Demo66 d=new Demo66() {
		void show() {
			System.out.println("Venkat");
			super.show();
		}
	};

	public static void main(String[] args) {
		day6_6 d1=new day6_6();
		d1.d.show();

	}

}
