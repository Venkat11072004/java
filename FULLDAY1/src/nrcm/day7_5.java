package nrcm;

public class day7_5 extends Thread {

	public static void main(String[] args) {
		day7_5 d1=new day7_5();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println("Hiiii!!!!");
		t1.sleep(20000);
		System.out.println("Hello.....");

	}

}
