package nrcm;

public class day6{
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a );
		this.add();
		
	}
	public static void main(String[] args) {
		day6 d1=new day6();
		d1.sub();
	}
}

