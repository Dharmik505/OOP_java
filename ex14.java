import java.util.Scanner;

class CoreBankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}

class SavingAccount extends CoreBankAccount {
    public void calculateInterest() {
        System.out.println(balance * 0.04);
    }
}

class FixedDepositAccount extends CoreBankAccount {
    public void maturityAmount(int years) {
        System.out.println(balance + (balance * 0.07 * years));
    }
}

public class BankInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();
        sa.openAccount(sc.next(), sc.next(), sc.nextDouble());
        sa.deposit(sc.nextDouble());
        sa.withdraw(sc.nextDouble());
        sa.checkBalance();
        sa.calculateInterest();

        FixedDepositAccount fda = new FixedDepositAccount();
        fda.openAccount(sc.next(), sc.next(), sc.nextDouble());
        fda.maturityAmount(sc.nextInt());
        sc.close();
    }
}
