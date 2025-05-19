package nrcm;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}
public class day4 extends Withdrawal {
	FixedAmount f1=new FixedAmount();
	void withdraw(int amount) {
		f1.fixedamount -= amount;
		System.out.println("Withdrawan: "+amount);
		System.out.println("Available Balance: "+f1.fixedamount);
	}

	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		day4 d=new day4();
		d.withdraw(amount);
	}

}
