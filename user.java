/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank_account;

/**
 *
 * @author pc
 */
public interface user {
    public boolean isVIP();
    public void setBan(boolean ban);
    public void setDate_Of_Birth(String Date_Of_Birth);
    public void setName(String name);
    public void setBalance(double balance);
    public String getName();
    public int getId();
    public double getBalance();
    public double addInterest(String username);
}
