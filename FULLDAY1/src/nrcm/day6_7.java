package nrcm;

public class day6_7 {

	public static void main(String[] args) {
		int a=20;
		System.out.println("Hello");
		try {
			int b=Integer.parseInt(args[0]);
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
}
