class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}
class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }
    void spend(double amount ) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Not enough money");
        }
        balance = balance - amount;
        System.out.println("Spent " + amount + ", left " + balance);
        }
    }
public class WalletDemo {
    public  static void main(String[] args) {
        Wallet w = new Wallet(500);

        try {
            w.spend(200);
            w.spend(400);
        } catch (LowBalanceException e ) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
