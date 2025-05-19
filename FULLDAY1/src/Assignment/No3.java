package Assignment;
interface Amul{
	void menu();
}
class Amul1{
	void icecreams() {
	}
}
class Amul2 extends Amul1 implements Amul{
	public void menu() {
		System.out.println("......Amul Icecream offers......");
	}
	public void icecreams() {
		System.out.println("Amul Ice Creams: ");
		System.out.println("1.Vanilla");
		System.out.println("2.Chocolate");
     	System.out.println("3.Strawberry");
	}
	public void cakes() {
		System.out.println("Amul Cakes: ");
		System.out.println("1.Red velvet");
		System.out.println("2.Black forest");
		System.out.println("3.Cheese cake");
	}
}
public class No3 extends Amul2{
	public void mainitems(){
		System.out.println("Icecreams and Cakes");
	}

	public static void main(String[] args) {
		No3 a1=new No3();
		a1.menu();
		a1.mainitems();
		a1.icecreams();
		a1.cakes();
	}

}
