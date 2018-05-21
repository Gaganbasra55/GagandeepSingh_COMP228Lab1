package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        String account_number=JOptionPane.showInputDialog("Enter Account number");
        String name=JOptionPane.showInputDialog("Enter name of customer");
        String option=JOptionPane.showInputDialog("Enter D to deposit \nOR\nEnter W to withdraw");

        BankAccount customer1=new BankAccount(account_number,name,50.00);

        //if user enter D

        if(option.equals("D")){
            String deposit=JOptionPane.showInputDialog("Enter Deposit Amount");
            double amount= Double.parseDouble(deposit);

            customer1.deposit_money(amount);
            customer1.getAccountInfo();
        }

        //if user enter W

        if(option.equals("W")){
            String withdraw=JOptionPane.showInputDialog("Enter Withdraw Amount");
            double amount= Double.parseDouble(withdraw);

            customer1.withdraw_money(amount);
            customer1.getAccountInfo();
        }

        // show result message

        String amount_message= customer1.getAccountInfo();
        JOptionPane.showMessageDialog(null,amount_message);
    }
}
