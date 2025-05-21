package nrcm;

public class day8 implements Runnable{
	public void run() {
		System.out.println("hi...");
	}

	public static void main(String[] args) {
		day8 d=new day8();
		day8 dd=new day8();
		System.out.println("Hello");
		d.run();
		dd.run();

	}

}
