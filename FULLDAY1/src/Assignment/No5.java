package Assignment;
interface Indian_Geography{
	void location();
	}
interface Indian_Geography1{
	void climatezones();
}
class Major_rivers{
	void rivers() {
		System.out.println("Himalayan Rivers (Perennial):");
		System.out.println("-> Ganga, Yamuna, Brahmaputra, Indus");
		System.out.println("Peninsular Rivers (Rain-fed):");
		System.out.println("Godavari, Krishna, Mahanadi, Narmada, Tapi, Cauvery");
	}
}
class Major extends Major_rivers implements Indian_Geography,Indian_Geography1{
	public void surroundings() {
		System.out.println("India shares borders with 6 countries:");
		System.out.println("1.Pakistan");
		System.out.println("2.China");
		System.out.println("3.Bhutan");
		System.out.println("4.Nepal");
		System.out.println("5.Bangladesh");
		System.out.println("6.Myanmar");
	}
	public void location() {
		System.out.println("Continent: Asia");
		System.out.println("Position: Northern Hemisphere, Eastern Hemisphere");
		System.out.println("Tropic of Cancer: Passes through India at 23°26'N");
	}
	public void climatezones() {
		System.out.println("Tropical (South India)");
		System.out.println("Subtropical (North India)");
		System.out.println("India has 3 major seasons:");
		System.out.println("Winter,Summer,Monsoon");
	}
	public void rivers() {
		System.out.println("Himalayan Rivers (Perennial):");
		System.out.println("-> Ganga, Yamuna, Brahmaputra, Indus");
		System.out.println("Peninsular Rivers (Rain-fed):");
		System.out.println("Godavari, Krishna, Mahanadi, Narmada, Tapi, Cauvery");
	}
	public void india() {
		System.out.println("-----Indian Geography Overview-----");
	}
}
public class No5 extends Major{
	public static void main(String[] args) {
		No5 n1=new No5();
		n1.india();
		n1.location();
		n1.climatezones();
		n1.rivers();
		n1.surroundings();
	}
}
