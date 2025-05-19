package nrcm;

public class day4_5 {
	int x;
	int y;
	public day4_5(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public day4_5(day4_5 d1) {
		this.x=d1.x;
		this.y=d1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day4_5 d1=new day4_5(10,30);
		day4_5 d2=new day4_5(d1);

	}

}
