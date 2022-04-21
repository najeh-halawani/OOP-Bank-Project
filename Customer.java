/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_project;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author qwerty
 */
public class Customer extends Account  {
    private double balance;
    private String Id;
    //Constructor

    public Customer(String Fname, String Lname, String email, String Birthday, Gender g) {
        super(Fname, Lname, email, Birthday, g);
        balance=0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        this.Id=dtf.format(now);
    }
    
    //Deposit
    public boolean Deposit(double deposit){
        balance+=deposit;
        return true;
    }
    //WithDraw
    public boolean WithDraw(double withdraw){
        if(withdraw<=balance){
            balance-=withdraw;
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Your Balance Is Not Sufficent! ");
            return false;
        }
    }
    //implements abstract method
    @Override
     public void setGender(String gender) {
        if(gender.equalsIgnoreCase("male")){
            this.g=Gender.male;
        }
        else if(gender.equalsIgnoreCase("female")){
             this.g=Gender.female;
        }
    }  
    @Override
    public  void setFname(String Fname){
        this.Fname=Fname;
    }
    @Override
    public  void setLname(String Lname){
        this.Lname=Lname;
    }
    
    //display
    @Override
    public String display(){
        super.display();
        return "Balance: "+balance;
    }
    
    
    
    
    
}
