package assign44;

public class SavingAccount extends BankAccount {

    double minimumBalance;

    public SavingAccount(
            double minimumBalance,
            int accountNumber,
            double balance,
            double interestRate) {

        super(accountNumber, balance, interestRate);

        this.minimumBalance = minimumBalance;
    }

    void withdraw(double amount) {

        balance -= amount;

        System.out.println(
            "Remaining Balance for your AccountNumber: "
            + accountNumber +
            " is: " +
            balance
        );
    }
}