package nrcm;
import java.util.*;
public class day7_2 {
	void add() throws ArithmeticException,InputMismatchException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		day7_2 d1=new day7_2();
		d1.add();

	}

}
