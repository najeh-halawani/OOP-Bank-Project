package bank_account;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


/**
 *
 * @author qwerty
 */
public class Customer {
    protected double rate;
    protected double Max_Withdraw;
    protected String firstName;
    protected String lastName;
    protected String Id;
    protected String name;
    protected String address;
    protected double balance;
    protected boolean banned;
    private static int idSalt=0;
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    private String birthdayDate;

    //Constructor
    public Customer() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        this.Id=dtf.format(now)+(idSalt++);
        this.balance=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        this.Id=dtf.format(now)+(idSalt++);
        this.balance=0;
    }

    public Customer(String name) {
        this.name = name;
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
    public String generateExpD() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM");
        LocalDateTime now = LocalDateTime.now().plusYears(1);
        String expDate = dtf.format(now);
        return expDate;
    }

    //setter
    public void setBan(boolean ban){
        banned=ban;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public double getBalance() {
        return balance;
    }

    //display

    public String display(){
        return "Customer Name: "+getFullName()+"\n"
                + "Id: "+Id+"\n"
                + "Balance: "+balance;
    }
}