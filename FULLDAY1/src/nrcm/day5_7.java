package nrcm;
interface I1{
	abstract void add();
	void sub();
}
public class day5_7 implements I1 {
	public void add() {
		System.out.println("hi....");
	}
	public void sub() {
		System.out.println("hello....");
	}
	public static void main(String[] args) {
		day5_7 d1=new day5_7();
		d1.add();
		d1.sub();
	}

}
