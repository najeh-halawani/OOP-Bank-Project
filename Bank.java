/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Bank {
    private String Name;
    private Atm[] atms;
    private String Location;
    private int maxAtms;
    private int atmCounter;

    public Bank() {}

    public Bank(String name,  String location, int maxAtms) {
        this.maxAtms = maxAtms;
        Name = name;
        atms=new Atm[maxAtms];
        Location = location;
        atmCounter=0;
    }

    


    public boolean isFullAtms(){
        if(atmCounter<atms.length){
            return false;
        }
        return true;
    }

    public boolean isEmptyAtms() {
        return atmCounter==0;
    }

    public boolean addAtm(Atm atm) {
        if(!isFullAtms()){
            atms[atmCounter++] = atm;
            return true;}
        else{
            JOptionPane.showMessageDialog(null, "No More Space!");
            return false;
        }    
    }


    public boolean removeAtm(Atm atm) {
        if (!isEmptyAtms()) {
            for (int i = 0; i < atmCounter; i++) {
                if (atms[i].getLocation() == atm.getLocation()) {
                    for (int j = i; j < atmCounter - 1; j++) {
                        atms[j] = atms[j + 1];
                    }
                }
                return true;
            }
        }
            return false;
    }

    public void getAllAtms(){
        for(int i=0; i < atmCounter; i++) {
            atms[i].display();
        }
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getLocation(){
        return Location;
    }
}
