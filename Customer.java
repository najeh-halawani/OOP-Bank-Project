/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author qwerty
 */
public class Customer implements user{
    protected double rate;
    protected double Max_Withdraw;
    protected String name;
    protected int Id=1;
    protected double balance;
    protected boolean banned;
    protected String Adress;
    protected boolean Type=false;
    protected String Date_Of_Birth;
    Admin a=new Admin();
    
    Connection con1;
    PreparedStatement insert;
    
    //Constructor
    public Customer(){
        
        Id++;
        this.balance=0; 
    }
    public Customer(String name){
        this.name=name;
        Id++;
        this.balance=0;    
    }

    @Override
    public boolean isVIP(){
       Type=true;
       return Type;
    }
    //setter
    @Override
    public void setBan(boolean ban){
        banned=ban;
    }

    @Override
    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //getter

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    String accType;
        Timer timer = new Timer();
        
        DecimalFormat ftm = new DecimalFormat("0.00");
    
    @Override
    public double addInterest(String username) {
//        System.out.println("PASS 0");
         try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "");
            insert = con1.prepareStatement("Select * from customers where username=?");
            insert.setString(1, username);
            
            ResultSet rs = insert.executeQuery();
            while(rs.next()) {
                 accType = rs.getString("AccountType");
                 balance = rs.getDouble("balance");
            }
             System.out.println(accType);
            
            if("REGULAR".equals(accType)) {
//                System.out.println("PASS 1");
                timer.schedule(new TimerTask() {
                  @Override
                  public void run() {
                      balance += balance * 0.000025;
                      
                      balance = Double.parseDouble(ftm.format(balance));
                      
                      JOptionPane.showMessageDialog(null, balance);
                      try {
//                          System.out.println("PASS 3");
                          insert = con1.prepareStatement("UPDATE customers SET balance=? where username=?;");
                          insert.setDouble(1, balance);
                          insert.setString(2, username);
                          insert.executeUpdate();
                          
                          
                      } catch (SQLException ex) {
                          Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                 
                }, 0, 5000);
                //60000
                return balance;
     
                
            } else { 
                  timer.schedule(new TimerTask() {
                  @Override
                  public void run() {
                      balance += balance * 0.0050;
                      try {
                          insert = con1.prepareStatement("UPDATE costumers SET balance=? where username=?;");
                          insert.setDouble(1, balance);
                          insert.setString(2, username);
                          insert.executeUpdate();
                            
                          
                      } catch (SQLException ex) {
                          Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                }, 0, 5000);
                return balance;
            }
            
            
         }catch (ClassNotFoundException ex){
             System.out.println(ex);
         } catch (SQLException ex) {
             System.out.println(ex);
         }
        return 0;
    }
    
    //display
    
    public String display(){
        return "Name: "+name+"\n"
                + "Id: "+Id+"\n"
                + "Balance: "+balance+"\n"
                + "Adress: "+Adress;
    }
}
