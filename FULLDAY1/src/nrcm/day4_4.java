package nrcm;

public class day4_4 {
    int a,b;
    public day4_4(int x,int y) {
    	a=x;
    	b=y;
    	System.out.println(a+b);
    }
    public void add() {
    	System.out.println(this.a-this.b);
    }
	public static void main(String[] args) {
		day4_4 d1=new day4_4(30,70);
		d1.add();
	}
}
