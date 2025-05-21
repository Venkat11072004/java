package nrcm;

public class day8_4 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedExceeption e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day8_4 d=new day8_4();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		d.start();
	}

}
