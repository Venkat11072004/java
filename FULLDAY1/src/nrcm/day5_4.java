package nrcm;
class chocolate{
	void eat() {
		System.out.println("Eating.....");
	}
}
class dark extends chocolate{
	void taste1() {
		System.out.println("Bagundhi anna.....");
	}
}
class sweet extends chocolate{
	void taste2(){
		System.out.println("Nijam ga bagundhi anna.....");
	}
}
class borbon extends dark{
	void costs1() {
		System.out.println("10rs");
	}
}
class amul extends dark{
	void costs2() {
		System.out.println("20rs");
	}
}
class diarymilk extends sweet{
	void weight1() {
		System.out.println("250gm");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("500gm");
	}
}
public class day5_4 {

	public static void main(String[] args) {
		borbon b=new borbon();
		amul a=new amul();
		diarymilk d=new diarymilk();
		kitkat k=new kitkat();
		b.eat();
		b.taste1();
		b.costs1();
		a.costs2();
		d.taste2();
		d.weight1();
		k.weight2();
	}
}
