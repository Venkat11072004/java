package nrcm;

import java.util.Scanner;

public class day2_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a color: ");
		String color=sc.next();
		switch(color) {
		case "red":
			System.out.println("hoil");
			break;
		case "green":
			System.out.println("ramzan");
			break;
		case "white":
			System.out.println("christamas");
			break;
			default:
				System.out.println("No festival");
			}
	}

}
