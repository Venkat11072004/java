package nrcm;

public class day3 {

	public static void main(String[] args) {
		String s1="king";
		String s2="king";
		String s3=new String("raghu");
		String s4=new String("ram");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s1.compareTo(s4));
	}

}
