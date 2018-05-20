import javax.swing.*;

public class PatientTest {
    public static void main(String[] args) {
        String patient_id=JOptionPane.showInputDialog("Enter patient ID");
        String first_name_=JOptionPane.showInputDialog("Enter First Name");
        String last_name=JOptionPane.showInputDialog("Enter Last Name");
        String address=JOptionPane.showInputDialog("Enter Address");
        String city=JOptionPane.showInputDialog("Enter City");
        String province=JOptionPane.showInputDialog("Enter Province");
        String postal_code=JOptionPane.showInputDialog("Enter Postal Code");

        Patient patient_test=new Patient(patient_id,first_name_,last_name,address,city,province,postal_code);

    
    }
}
