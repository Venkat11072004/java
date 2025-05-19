
package nrcm;
abstract class Test3{
	abstract void add();
	abstract void sub();
	abstract void display();
	abstract void show();
}
class day3_7 extends Test3{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void display() {
		System.out.println("we learnt till arrays");
	}
	public void show() {
		System.out.println("now we are learning abstract class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day3_7 d1=new day3_7();
		d1.add();
		d1.sub();
		d1.display();
		d1.show();
	}

}
