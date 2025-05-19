package nrcm;

public class day2_2 {

	public static void main(String[] args) {
		int a=12;
		if(a%2==0)
		{
			System.out.println("div by 2");
		}
		else {
			if(a%3==0) {
				System.out.println("div by 3");
			}
			else {
				System.out.println("not div by 2 and 3");
			}
		}
	}

}
