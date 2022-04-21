package bank_account;

import java.util.Date;

public class Atm {
    private String Location;
    private double maxAmount;
    public int closingHour;
    public int openingHour;
    Date d = new Date();


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(int closingHour) {
        this.closingHour = closingHour;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public Atm() {}

    public Atm(String location, int openingHours, int closingHours,  double maxAmout) {
        this.openingHour = openingHours;
        this.closingHour = closingHours;
        Location = location;
        this.maxAmount = maxAmout;
    }

    public Atm(String location) {
        Location = location;
    }

    public void display() {
        System.out.println("Atm{ " +
                "Location='" + Location + '\'' +
                ", maxAmount=" + maxAmount +
                ", closingHour=" + closingHour +
                ", openingHour=" + openingHour +
                ", d=" + d +
                '}');
    }

    public boolean Deposit(Customer c, double depositAmount) {
        if( d.getTime() >= openingHour && d.getTime() <= closingHour) {
            if(depositAmount >0) {
                c.Balance = c.getBalance() + depositAmount;
            return true;
            }
        }
        return false;
    }

    public boolean Withdraw(Customer c, double withdrawAmount) {
        if(d.getTime() >= openingHour && d.getTime() <= closingHour) {
            if(withdrawAmount <= c.Balance) {
                c.Balance = c.getBalance() - withdrawAmount;
                return true;
            }
        }
        return false;
    }

}
