package nrcm;

public class day2_1 {

	public static void main(String[] args) {
		int a=9;
		if(a%2==0) {
			System.out.println("divisible by 2");
			if(a%3==0) {
				System.out.println("divisible by 3");
			}
			else {
				System.out.println("It is not divisible by 3");
			}
		}
			else {
				if(a<10) {
					System.out.println("Below 10");
				}
				else {
					System.out.println("above 10");
				}
			}

	}

}
