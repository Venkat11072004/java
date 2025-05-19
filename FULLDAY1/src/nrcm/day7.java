package nrcm;
import java.util.*;

public class day7{
	public static void main(String[] args) throws ArithmeticException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		//try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);//unchecked exception will work onli on try catch methods not on throws
	//	}catch(ArithmeticException e) {
		//	System.out.println(e.getMessage());
	//	}catch(InputMismatchException e) {
		//	System.out.println(e.getMessage());
	//	}
		
	}

}