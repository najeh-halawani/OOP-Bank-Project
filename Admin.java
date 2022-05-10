/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Admin {
    protected int current;
    protected int num_of_admin;
    //constructor
    public Admin(){
        current=0;
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

    //Max WithDraw
//    public void MaxWithDraw(Customer c){
//        if(SearchCustomer(c)==1){
//            int count=1;
//            for(int i=0;i<current;i++){
//                if(customers[i]==c&&customers[i] instanceof Vip_Account){
//                        customers[i].Max_Withdraw=20000;
//                        
//                      
//                    }
//                    else{
//                        customers[i].Max_Withdraw=5000;   
//                        
//                    }
//                }
//        }
//      
//                
//    }
    //generate credit card
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
    //generate cvv
       public int generateCVV() {
        Random random = new Random();
        int cvv = random.nextInt(999)+100;
        return cvv;
    }

    // generate expiry date + year from today
    public String generateExpD() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM");
        LocalDateTime now = LocalDateTime.now().plusYears(1);
        String expDate = dtf.format(now);
        return expDate;
    }
    
    //Intrest
//    public double AddIntrest(Customer c){
//        if(SearchCustomer(c)!=-1){
//            for(int i=0;i<current;i++){
//                if(customers[i]==c){
//                    if(customers[i] instanceof Vip_Account){
//                        customers[i].rate=0.12;
//                        return 0.12;
//                    }
//                    else if(customers[i] instanceof Regular_Account){
//                        customers[i].rate=0.25;
//                        return 0.25;
//                    }
//                }
//            }
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Not Found");
//          
//        } 
//        return 0;
//    }
}
     

