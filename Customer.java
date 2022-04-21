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
    protected String Id;
    protected double balance;
    protected boolean banned;
    //Constructor
    public Customer(){}
    public Customer(String name){
        this.name=name;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        this.Id=dtf.format(now);
        this.balance=0;    
    }
    //setter
    public void setBan(boolean ban){
        banned=ban;
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

    public String getId() {
        return Id;
    }

    public double getBalance() {
        return balance;
    }
    
    //display
    
    public String display(){
        return "Name: "+name+"\n"
                + "Id: "+Id+"\n"
                + "Balance: "+balance;
    }
}
