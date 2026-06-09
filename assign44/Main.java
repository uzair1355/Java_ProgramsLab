package assign44;

public class Main {

    public static void main(String[] args) {

        BankAccount b1 =
            new BankAccount(
                1234567890,
                1000,
                10
            );

        b1.deposit(7000);

        SavingAccount s1 =
            new SavingAccount(
                20,
                30,
                400000,
                0.7
            );

        s1.withdraw(1000);
    }
}