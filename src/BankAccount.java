public class BankAccount {

    //variables

    private String account_number;
    private String name;
    private double balance;

    //constructor

    public BankAccount(String account_number, String name, double balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }

//get and set for account number

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

// get and set for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// get and set for balance

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //deposit money method

    public void deposit_money(double deposit_amt){
        if(deposit_amt>0.00)
            balance+=deposit_amt;
    }

    // withdraw money method

    public void withdraw_money(double withdraw_amt){
        if(withdraw_amt>0.00&&withdraw_amt<=balance)
            balance-=withdraw_amt;
    }

    //get account information

    public String getAccountInfo(){
        return "Account number= "+account_number+"\n"+"Name= "+name+"\n"+"Balance= $"+balance+"\n";
    }
}
