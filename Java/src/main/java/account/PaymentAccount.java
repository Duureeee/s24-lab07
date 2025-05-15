package account;
public abstract class PaymentAccount {
    private final String accountHolder;
    private final int accountNumber;

    public PaymentAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public abstract boolean pay(int amount);

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
}
