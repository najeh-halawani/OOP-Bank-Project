package bank_account;

import javax.swing.*;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
     *
     * @author qwerty
     */
    public class Admin {
        protected Customer[] customers;
        protected int current;
        protected int num_of_admin;
        //constructor
        public Admin(){
            customers=new Customer[10];
            current=0;
            num_of_admin=5;
        }
        //IsFull
        public boolean isFull(){
            if(current==customers.length){
                return true;
            }
            else{
                return false;
            }
        }

        // generate Credit Card Number
        public String generateCreditNumber() {
        Random random = new Random();
        String creditNumber;
        int rand1, rand2, rand3;

        rand1 = random.nextInt(9999)+1000;
        rand2 = random.nextInt(9999)+1000;
        rand3 = random.nextInt(9999)+1000;

        creditNumber = rand1 + " " + rand2 + " " + rand3;

        return creditNumber;
        }

        // generate random cvv
        public int generateCVV() {
            Random random = new Random();
            int cvv = random.nextInt(999)+100;
            return cvv;
        }

        // generate expiry date + year from today
        public LocalDateTime generateExpD() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM");
            LocalDateTime expDate = LocalDateTime.now().plusYears(1);
            return expDate;
        }


        //Add Customer
        public boolean AddCustomer(Customer c){
            if(current<customers.length){
                customers[current]=c;
                current++;
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"No More Space");
                return false;
            }
        }
        //Search Customer
        public int SearchCustomer(Customer c){
            for(int i=0;i<current;i++){
                if(customers[i]==c){
                    return 1;
                }
            }
            return -1;
        }
        //Remove Customer
        public boolean RemoveCustomer(Customer c){
            if(SearchCustomer(c)!=-1){
                for(int i=0;i<current;i++){
                    if(customers[i]==c){
                        for(int j=i;j<current-1;j++){
                            customers[j]=customers[j+1];
                        }
                    }
                }
                return true;
            }
            else{
                return false;
            }
        }
        //Ban Customer
        public boolean BanAccount(Customer c){
            c.setBan(true);
            return true;
        }
        //Remove
        public boolean removeband(Customer c) {
            c.setBan(false);
            return true;
        }
        //display customer
        public String DisplayCustomer(String name){
            for(int i=0;i<current;i++){
                if(customers[i].getName().equals(name)){
                    return  customers[i].display();
                }
            }
            return "";
        }
        //Max WithDraw
        public int MaxWithDraw(Customer c){
            if(SearchCustomer(c)!=-1){
                for(int i=0;i<current;i++){
                    if(customers[i]==c){
                        if(customers[i] instanceof Vip_Account){
                            customers[i].Max_Withdraw=5000;
                            return 5000;
                        }
                        else if(customers[i] instanceof Regular_Account){
                            customers[i].Max_Withdraw=20000;
                            return 20000;
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Found");

            }
            return 0;
        }

        //Intrest
        public double AddIntrest(Customer c){
            if(SearchCustomer(c)!=-1){
                for(int i=0;i<current;i++){
                    if(customers[i]==c){
                        if(customers[i] instanceof Vip_Account){
                            customers[i].rate=0.12;
                            return 0.12;
                        }
                        else if(customers[i] instanceof Regular_Account){
                            customers[i].rate=0.25;
                            return 0.25;
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Found");

            }
            return 0;
        }
    }