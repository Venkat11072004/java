package nrcm;
class VenkatException extends Exception{
	public VenkatException(String message) {
		super(message);
	}
	
}
public class day7_3 {
	public static void Math(int n) throws VenkatException {
		if(n%2==0) {
			throw new VenkatException("Nak maths vachu!!!");
		}else {
			System.out.println("Nak maths radhu!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Math(11);
		}catch(VenkatException e) {
			System.out.println(e.getMessage());
		}

	finally {
		System.out.println("Maths vachina gurthundadhu!!!");
	}
}}