class SafeAccount {
    private final String accountNo;
    private double balance;

    SafeAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountNo() {
        return accountNo;
    }
}

public class SafeAccountDemo {
    public static void main(String[] args) {
        SafeAccount acc = new SafeAccount("AC101", 1000);
        acc.deposit(500);
        acc.deposit(-100);
        acc.withdraw(2000);
        acc.withdraw(300);
        System.out.println(acc.getAccountNo() + " balance = " + acc.getBalance());
    }
}