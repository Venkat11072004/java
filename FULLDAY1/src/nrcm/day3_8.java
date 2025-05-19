package nrcm;
abstract class Test{
	abstract void add();
	abstract void sub();
	void div() {
		int a=20,b=10;
		System.out.println(a/b);
	}
	void mod() {
		int a=10,b=20;
		System.out.println(a%b);
	}
	static void mul() {
		int a=10,b=20;
		System.out.println(a*b);
	}
}
class sample extends Test{
	public void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	public void sub() {
		int a=20,b=10;
		System.out.println(a-b);
	}
}
class day3_8{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample d1=new sample();
		d1.add();
		d1.sub();
		d1.div();
		d1.mod();
		Test.mul();
	}
}

