package nrcm;

public class day2_3 {

	public static void main(String[] args) {
		int h=60;
		if(h>=75) {
			if(h<85) {
				System.out.println("we can use pain killer");
			}
			else {
				System.out.println("we can use boosters");
			}
		}
		else {
			if(h<65) {
				System.out.println("we can use medikit");
			}
			else {
				System.out.println("we can use bandages");
			}
		}
		

	}

}
