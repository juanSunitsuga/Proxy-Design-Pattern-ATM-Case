public class ATMProxy implements BankAccountInterface {
    private RealBankAccount realBankAccount;
    private String pin;

    public ATMProxy(RealBankAccount realBankAccount, String pin) {
        this.realBankAccount = realBankAccount;
        this.pin = pin;
    }

    private boolean authenticate(String inputPin) {
        return this.pin.equals(inputPin);
    }

    @Override
    public void withdraw(double amount) {
        if (authenticate("1234")) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (authenticate("1234")) {
            realBankAccount.deposit(amount);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public double getBalance() {
        if (authenticate("1234")) {
            return realBankAccount.getBalance();
        } else {
            System.out.println("Authentication failed. Access denied.");
            return 0;
        }
    }
}
