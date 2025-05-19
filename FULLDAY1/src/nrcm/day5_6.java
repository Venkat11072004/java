package nrcm;
class demo{
	void add() {
		System.out.println("Hi....");
	}
}
public class day5_6 extends demo {
	void add() {
		System.out.println("Hello....");
	}
	public static void main(String[] args) {
		day5_6 d1=new day5_6();
		d1.add();
	}
}
/*class demo{
	public static void main(String[] args){
		System.out.println("Hi....");
	}
}
public class day5_6 {
	public static void main(String[] args) {
		day5_6 d1=new day5_6();
		d1.main();
	}
}*/
