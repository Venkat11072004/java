package nrcm;
class Venkat1 {
	static void show() {
	   System.out.println("Hello!");
	}
	static class Nayak1{
		static void print() {
			System.out.println("World....");
			show();
		}
	}
}
public class day6_5 {
	public static void main(String[] args) {
		Venkat1.Nayak1.print();
	}

}
