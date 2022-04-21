package bank_account;


/**
 *
 * @author qwerty
 */
public class Vip_Account extends Customer {
    private Admin a;

    //Constructor1
    public Vip_Account(String name) {
        super(name);
    }

    //Constructor2
    public Vip_Account() {
    }

    //display
    @Override
    public String display() {
        super.display();
        return "Max WithDraw: " + a.MaxWithDraw(this);
    }


}
