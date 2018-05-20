import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        String account_number=JOptionPane.showInputDialog("Enter Account number");
        String name=JOptionPane.showInputDialog("Enter name of customer");
        String option=JOptionPane.showInputDialog("Enter D to deposit %nOR%n Enter W to withdraw");

        if(option.equals("D")){
            String deposit=JOptionPane.showInputDialog("Enter Deposit Amount");
            double amount= Double.parseDouble(deposit);

            

        }

    }
}
