package nrcm;

public class day4_6 {
	int e;
	double x;
	String y=new String();
	float z;
	long a;
	public day4_6(int e) {
		System.out.println("Employee details "+e);
	}
	public day4_6(double x) {
		this.x=x;
		System.out.println("Eid: "+x);
	}
	public day4_6(String y){
		this.x=x;
		this.y=y;
		System.out.println("Name: "+y);
	}
	public day4_6(float z) {
		this.z=z;
		System.out.println("Salary: "+z);
	}
	public day4_6(long a) {
		this.a=a;
		System.out.println("Mobile_number: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day4_6 d1=new day4_6(1);
		day4_6 d2=new day4_6(575);
		day4_6 d3=new day4_6("Venkat");
		day4_6 d4=new day4_6(30000);
		day4_6 d5=new day4_6(7569032875l);
		day4_6 d6=new day4_6(2);
		day4_6 d7=new day4_6(576);
		day4_6 d8=new day4_6("Ram");
		day4_6 d9=new day4_6(35000);
		day4_6 d10=new day4_6(8328368709l);
		day4_6 d11=new day4_6(3);
		day4_6 d12=new day4_6(577);
		day4_6 d13=new day4_6("Raghu");
		day4_6 d14=new day4_6(40000);
		day4_6 d15=new day4_6(9391742010l);
		
	}

}
