package bank_account;

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
        this.atms = atms;
        Location = location;
        atmCounter=0;
    }


    public boolean isFullAtms(){
        return maxAtms == atms.length;
    }

    public boolean isEmptyAtms() {
        return atmCounter==0;
    }

    public boolean addAtm(Atm atm) {
        if(!isFullAtms()) {
            atms[atmCounter++] = atm;
            return true;
        }
        return false;
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
        for(int i=0; i < atms.length; i++) {
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
