package account;

public class DebitCard extends PaymentAccount {
    private int balance;

    public DebitCard(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber);
        this.balance = balance;
    }

    @Override
    public boolean pay(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
