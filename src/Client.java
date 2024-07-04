public class Client {
    public static void main(String[] args) {
        RealBankAccount bankAccount = new RealBankAccount(1000);

        //Correct PIN

        ATMProxy atm = new ATMProxy(bankAccount, "1234");
        atm.deposit(500); //New balance: 1500.0
        System.out.println("Balance: " + atm.getBalance()); //Balance: 1500.0
        atm.withdraw(200); //New balance: 1300.0
        System.out.println("Balance: " + atm.getBalance()); //Balance: 1300.0

        //Incorrect PIN

//        ATMProxy wrongPinAtm = new ATMProxy(bankAccount, "0000");
//        wrongPinAtm.deposit(100); //Authentication failed. Access denied.
//        System.out.println("Balance: " + wrongPinAtm.getBalance()); //Authentication failed. Access denied.
//        wrongPinAtm.withdraw(100); //Authentication failed. Access denied.
//        System.out.println("Balance: " + wrongPinAtm.getBalance()); //Authentication failed. Access denied.
    }
}
