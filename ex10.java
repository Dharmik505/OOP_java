import java.util.Scanner;

public class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 4.5;

    public BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    public void calculateInterest() {
        double interest = balance * (interest_rate / 100);
        System.out.println(interest);
    }

    public static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(sc.next(), sc.nextDouble());
        acc.calculateInterest();
        
        BankAccount.updateInterestRate(sc.nextDouble());
        acc.calculateInterest();
        sc.close();
    }
}
