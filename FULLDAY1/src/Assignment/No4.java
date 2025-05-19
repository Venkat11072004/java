package Assignment;
interface Bikes{
	void bikes();
}
interface Cars{
	void cars();
}
class Models{
	public void Bikemodels() {
		
	}
    public void Carmodels() {
		
	}
}
class Automobiles extends Models implements Bikes,Cars{
	public void types() {
		System.out.println("Types of Automobiles:");
	}
	public void bikes() {
		System.out.println("Bikes:");
	}
	public void cars() {
		System.out.println("Cars:");
	}
	public void Bikemodels() {
		System.out.println("1.Ducati Panigale V4");
		System.out.println("2.BMW S1000RR");
		System.out.println("3.Kawasaki ZX10R");
		System.out.println("4.Suzuki Hayabusa");
	}
	public void Carmodels() {
		System.out.println("1.Lamborghini");
		System.out.println("2.Mercedes");
		System.out.println("3.Ferrari");
		System.out.println("4.McLaren");
	}
}
public class No4 extends Automobiles{
	public static void main(String[] args) {
		No4 n1=new No4();
		n1.types();
		n1.bikes();
		n1.Bikemodels();
		n1.cars();
		n1.Carmodels();

	}

}
