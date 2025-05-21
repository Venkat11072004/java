package nrcm;

public class day8_5 extends Thread {
	String s;
	public day8_5(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+" is Deamon Thread");
		}
		else {
			System.out.println(s+" is user Thread");
		}
	}

	public static void main(String[] args) {
		day8_5 t1=new day8_5("t1");
		day8_5 t2=new day8_5("t2");
		day8_5 t3=new day8_5("t3");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.setDaemon(false);
		t3.start();
	}

}
