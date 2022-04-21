package bank_account;

public class Main {

    public static void main(String[] args) {

        Bank b1= new Bank("bank 1", "ABu samra", 10);

        Atm atm1 = new Atm("Tripoli", 10, 12,  100000);


        b1.addAtm(atm1);


        b1.getAllAtms();

    }
}
