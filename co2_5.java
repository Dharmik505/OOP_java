import java.util.Scanner;

public class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    public void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    public void displayValues() {
        System.out.println(accountId + " " + accountHolderName + " " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[5];
        
        for (int i = 0; i < 5; i++) {
            accounts[i] = new BankAccount();
            accounts[i].assignValues(sc.next(), sc.next(), sc.nextDouble());
        }
        
        String searchId = sc.next();
        for (BankAccount acc : accounts) {
            if (acc.accountId.equals(searchId)) {
                acc.displayValues();
            }
        }
        sc.close();
    }
}
