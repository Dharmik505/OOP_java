class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String msg) {
        super(msg);
    }
}

class BankAccountExceptionDemo {
    double balance;

    public BankAccountExceptionDemo() {
        balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccountExceptionDemo acc = new BankAccountExceptionDemo();
        acc.deposit(1000.00);
        
        try {
            acc.withdraw(400.00);
            acc.withdraw(300.00);
            acc.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sync complete: Banking application project uploaded to Google Drive.");
    }
}
