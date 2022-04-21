/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_project;

/**
 *
 * @author qwerty
 */
enum Gender{female,male};
public abstract class Account {
    protected Gender g;
    protected String Fname;
    protected String Lname;
    protected String email;
    protected String Birthday;
    //Constructor1
    public Account(){}
    //Constructor2
    public Account(String Fname, String Lname, String email, String Birthday,Gender g) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
        this.Birthday = Birthday;
        this.g=g;
    }
    //Getters
    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return Birthday;
    }
    //setters abstract
    public abstract void setG(Gender g);

    public abstract void setFname(String Fname);

    public abstract void setLname(String Lname);
    //setters 
    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
    
    //display
    public String display() {
        return "Account\n" + "---------"
               + "\nGender: " + g + "\nFname: " + Fname + ""
                + "\nLname=" + Lname + ""
                + "\nEmail=" + email + ""
                + "\nBirthday=" + Birthday;
    }
    
    
    
}
