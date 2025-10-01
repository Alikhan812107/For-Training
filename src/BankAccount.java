public class BankAccount {
    private double balance;

    public void deposit(double amount) {

        if (amount > balance) {
            balance = balance + amount;
        }
        else {
            System.out.println("Must be possitive");

        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;

        } else {
            System.out.println("Invalid withdraw attempt");
        }
    }

    public double getBalance() {
        return balance;
    }

}
