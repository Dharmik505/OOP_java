import java.util.Scanner;

class Payment {
    public void processPayment(int amount) {
        System.out.println(amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int amount = sc.nextInt();
        Payment p;
        
        if (choice == 1) {
            p = new CreditCardPayment();
        } else {
            p = new UPIPayment();
        }
        p.processPayment(amount);
        sc.close();
    }
}
