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
    public void deposit_money(double deposit_amt){
        if(deposit_amt>0.00)
            balance+=deposit_amt;
    }
    public void withdraw_money(double withdraw_amt){
        if(withdraw_amt>0.00&&withdraw_amt<=balance)
            balance-=withdraw_amt;
    }
}
