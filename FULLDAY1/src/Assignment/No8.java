package Assignment;
interface Mobile{
	void brand(String brand);
}
interface Type{
	void model(String model);
}
class Price{
	void price(double price) {
	}
}
class Storage extends Price implements Mobile{
	public void storage() {
		System.out.println("Storage: 512gb");
	}
	public void price(double price) {
		System.out.println("Moblie: "+price);
	}
	public void brand(String brand) {
		System.out.println("Brand: "+brand);
	}	
}
class Varient implements Type{
	public void model(String model) {
		System.out.println("Model: "+model);
	}
	public void varient(String varient) {
		System.out.println("Varient: "+varient);
	}
}
public class No8 {
	public static void main(String[] args) {
		Storage s1=new Storage();
		Varient v1=new Varient(); 
		s1.brand("Samsung");
		v1.model("Samsung S25 Ultra");
		v1.varient("Flagship Varient");
		s1.storage();
		s1.price(125000.00);
		
	}
}
