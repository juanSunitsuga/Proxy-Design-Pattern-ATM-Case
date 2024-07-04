public class RealBankAccount implements BankAccountInterface {
    private double balance;

    public RealBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
