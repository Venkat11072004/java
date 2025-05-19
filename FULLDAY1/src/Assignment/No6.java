package Assignment;
interface Deposit {
    void depositAmount(double amount);
}

interface Withdrawal {
    void withdrawAmount(double amount);
}

interface Check_Balance {
    void checkBalance(double amount);
}
interface Statement {
    void generateStatement();
}
class Account implements Deposit, Withdrawal, Check_Balance {
    public void depositAmount(double amount) {
        System.out.println("Deposited: ₹" + amount);
    }
    public void withdrawAmount(double amount) {
            System.out.println("Withdrawn: ₹" + amount);
        }
    public void checkBalance(double amount) {
        System.out.println("Current Balance: ₹" + amount);
    }
}
class No61 extends Account implements Statement {
	public void generateStatement() {
		System.out.println("Your Bank Statement:");
		System.out.println("Deposited amount: ₹6000");
		System.out.println("withdrawal amount: ₹2500");
	}
}
public class No6 extends No61{
public static void main(String[] args) {
        No6 b = new No6();
        b.depositAmount(6000);
        b.withdrawAmount(2500);
        b.checkBalance(3500);
        b.generateStatement();
    }
}