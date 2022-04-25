/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author qwerty
 */
public class Customer {
    protected double rate;
    protected double Max_Withdraw;
    protected String name;
    protected int Id=1;
    protected double balance;
    protected boolean banned;
    protected String Adress;
    protected boolean Type=false;
    protected String Date_Of_Birth;
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
    Admin a=new Admin();
    public void setMaxWithdraw(){
        
        a.MaxWithDraw(this);
    }
    public boolean isVIP(){
       Type=true;
       return Type;
    }
    //setter
    public void setBan(boolean ban){
        banned=ban;
    }

    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //getter

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public double getBalance() {
        return balance;
    }
    
    //display
    
    public String display(){
        return "Name: "+name+"\n"
                + "Id: "+Id+"\n"
                + "Balance: "+balance+"\n"
                + "Adress: "+Adress;
    }
}
