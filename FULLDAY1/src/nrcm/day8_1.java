package nrcm;
class day8_11 extends Thread{
	public void run() {
		System.out.println("hi...");
	}
}
class day8_12 extends Thread{
	public void run() {
		System.out.println("Good morning");
	}
}
public class day8_1{
	public static void main(String[] args) {
		day8_11 d=new day8_11();
		day8_12 dd=new day8_12();
		System.out.println("Hello");
		d.run();
		dd.run();

	}

}
