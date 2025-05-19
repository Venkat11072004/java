package nrcm;

public class day4_3 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		day4_3 d1=new day4_3();
		d1.sub();
	}
}
