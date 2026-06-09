package assign44;

public class BankAccount {

    int accountNumber;
    double balance;
    double interestRate;

    public BankAccount(
            int accountNumber,
            double balance,
            double interestRate) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {

        balance += amount;

        System.out.println(
            "Balance for your AccountNumber: "
            + accountNumber +
            " is: " +
            balance
        );
    }
}