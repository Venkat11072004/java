package nrcm;
class sample1{
	int x=90;
}
public class day5_9 extends sample1 {
	void show() {
		int y=10;
		System.out.println(super.x+y);
	}

	public static void main(String[] args) {
		day5_9 d1=new day5_9();
		d1.show();
	}

}