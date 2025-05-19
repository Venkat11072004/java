package nrcm;
class fruits{
	void benifits(){
		System.out.println("Healthy");
	}
}
class apple extends fruits{
	void color(){
		System.out.println("Red");
	}
}
class mango extends fruits{
	void price(){
		System.out.println("100rs per kilogram ");
	}
}
class banana extends fruits{
	void taste(){
		System.out.println("Sweet");
	}
}
public class day5_2 {

	public static void main(String[] args) {
		apple a=new apple();
		mango m=new mango();
		banana b=new banana();
		a.benifits();
		a.color();
		b.taste();
		m.price();
	}

}
