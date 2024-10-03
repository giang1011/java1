package Service;

public abstract class TransactionService {
    public Object withdraw;

    public abstract void transaction(double amount);

    public abstract void deposit(double amount);

    protected abstract void withdraw(double amount);

}
