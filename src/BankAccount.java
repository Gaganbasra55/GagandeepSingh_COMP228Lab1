public class BankAccount {
    private String account_number;
    private String name;
    private double balance;

    public BankAccount(String account_number, String name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
