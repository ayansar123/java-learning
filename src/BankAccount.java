public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrew " + amount);
        }
    }

    void showBalance() {
        System.out.println(owner + " balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ayan", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(5000);
        acc.showBalance();
    }
}