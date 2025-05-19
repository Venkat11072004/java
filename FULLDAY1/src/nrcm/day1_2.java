package nrcm;

public class day1_2 {
	int a=10,b=20;
	static int x=20,y=30;
	void instan() 
	{
		int c=2,d=98;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(c+d);
	}
	static void stati() 
	{
		int c=2,d=98;
		System.out.println(x+y);
		System.out.println(c+d);	
	}
    public static void main(String[] args) {
		day1_2 d1=new day1_2();
		d1.instan();
		stati();
	}
}
