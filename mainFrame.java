package bank_account;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame implements ActionListener {
    private static JFrame frame;
    private JPanel mainPanel;
    private JButton dashboardButton;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton transactionsButton;
    private JPanel buttonsPanel;
    private JPanel parentPanel;
    private JPanel dashboardPanel;
    private JPanel depositPanel;
    private JPanel withdrawPanel;
    private JPanel transactionPanel;
    private JPanel loginPanel;
    private JPanel modelPanel;
    private JTextField usernameField;
    private JPasswordField pinField;
    private JButton loginButton;


    public mainFrame() {

//        mainPanel.removeAll();
//        mainPanel.add(modelPanel);
//        mainPanel.repaint();
//        mainPanel.revalidate();

        dashboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(dashboardPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                parentPanel.removeAll();
                parentPanel.add(depositPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(withdrawPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        transactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(transactionPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
    }



    public static void main(String[] args) {
        frame = new JFrame("Login to Dashboard");
        frame.setContentPane(new mainFrame().loginPanel);
        frame.setSize( 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
