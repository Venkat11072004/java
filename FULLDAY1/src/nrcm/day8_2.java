package nrcm;
class day81 extends Thread{
	public void run() {
		System.out.println("hi...");
	}
}
class day82 extends day81{
	public void run() {
		System.out.println("Good morning");
	}
}
class day83 implements Runnable{
	public void run() {
		System.out.println("what are you doing ?");
	}
}
class day84 extends day83{
	public void run() {
		System.out.println("let's go.....");
	}
}

class day8_2{
	public static void main(String[] args) {
		day81 d=new day81();
		day82 d1=new day82();
		day83 d2=new day83();
		day84 d3=new day84();
		//System.out.println("Hello");
		d.start();
		d1.start();
		Thread t1=new Thread(d2);
		t1.start();
		Thread t2=new Thread(d3);
		t2.start();
	}

}