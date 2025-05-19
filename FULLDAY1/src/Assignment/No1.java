package Assignment;

interface Total {
    void calculateTotal(int x);
}

interface Discount {
    void applyDiscount(double percent);
}

interface Invoice extends Total, Discount {
    void generateInvoice();
}

class store implements Invoice {
    private int totalPrice;
    private double discountedPrice;

    public void Generalstore() {
        System.out.println("<<<<<<<<GENERAL STORE>>>>>>>>");
    }

    public void calculateTotal(int x) {
        totalPrice = x;
        discountedPrice = x;
        System.out.println("Calculating total price of items in cart: " + totalPrice);
    }

    public void applyDiscount(double percent) {
        discountedPrice = totalPrice - (totalPrice * percent / 100);
        System.out.println("Applying " + percent + "% discount.");
        System.out.println("Discounted price: " + discountedPrice);
    }

    public void generateInvoice() {
        System.out.println("Generating invoice...");
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Amount Payable After Discount: " + discountedPrice);
    }
}

public class No1 extends store {
    public static void main(String[] args) {
        No1 n = new No1();
        n.Generalstore();
        n.calculateTotal(1000);
        n.applyDiscount(10);
        n.generateInvoice();
    }
}
