package nrcm;
class sample3{
	public sample3() {
		System.out.println("Super constructor");
	}
}
public class day5_11 extends sample3{
	public day5_11() {
	    super();
	}
	public static void main(String[] args) {
		day5_11 d1=new day5_11();
	}
}