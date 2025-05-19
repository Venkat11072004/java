package nrcm;
interface In{
	void add();
}
interface In2{
	void add();
}
public class day5_8 implements In,In2{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello....");
	}

	public static void main(String[] args) {
		day5_8 d=new day5_8();
		d.add();
		d.sub();
		
	}

}
