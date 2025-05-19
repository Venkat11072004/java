package nrcm;

public class day4_1 {
	private String firstName;
	private String lastName;
	private String emailid;
	private long number;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String em) {
		emailid=em;
	}
	public void setNumber(long num) {
		number=num;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return emailid;
	}
	public long getNumber() {
		return number;
	}
	public static void main(String[] args) {
		day4_1 d1=new day4_1();
		d1.setFirstName("Venkat");
		d1.setLastName("Nayak");
		d1.setEmail("venkatnayak@gmail.com");
		d1.setNumber(7569032875l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmail());
		System.out.println(d1.getNumber());
	}

}
