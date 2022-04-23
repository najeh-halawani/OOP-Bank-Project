package bank_account;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminDashboard {
    private JPanel adminPanel;
    private JTextField firstNameField;
    private JTextField addressField;
    private JTextField lastNameField;
    private JTextField birthDayField;
    private JTextField generatedCreditCard;
    private JTextField generatedCVV;
    private JTextField generatedExpD;
    private JButton addCustomerButton;
    private Customer c;
    private Admin admin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Admin Dashboard");
        frame.setContentPane(new adminDashboard().adminPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public adminDashboard() {
        addCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || addressField.getText().isEmpty() || birthDayField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the Fields");
                } else {
                    c = new Customer();
                    c.setFirstName(firstNameField.getText());
                    c.setLastName(lastNameField.getText());
                    c.setAddress(addressField.getText());
                    c.setBirthdayDate(birthDayField.getText());
//                    admin.AddCustomer(c);
                    generatedCreditCard.setText(c.generateCreditNumber());
                    generatedCVV.setText(c.generateCVV()+"");
                    generatedExpD.setText(c.generateExpD());

                }
            }
        });
    }
}
