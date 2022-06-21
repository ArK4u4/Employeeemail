package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department ;
    private String email;
    private String compSuffix = "ark.comm";
    private String alternateEmail;
    private int mailboxCapacity=8;
    private int defaultPasswordLength = 8;
    private int getMailboxCapacity;
    private String getAlternateEmail;
    private String getPassword;


    // Constructor for receive the first name and last name
    public Email (String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //**System.out.println ("EMAIL CREATED FOR "+this.firstName  +this.lastName);
        // Call a method and return department value
        this.department = setDepartment ();
        //*System.out.println ("Department :" +this.department);
        // Call a method that return a random password
        this.password = randomPassword(this.defaultPasswordLength);
       // System.out.println ("your random password is :" + this.password);
        // Combine element to generate email
        email = firstName.toLowerCase ()+"."+lastName.toLowerCase ()+"@"+department.toLowerCase ()+"."+compSuffix;
        //System.out.println ("your email is " + email);
    }
    // Ask for department
    private String setDepartment() {
        System.out.println ("Hey! Here are the departments ....\n 1 for Sales \n 2 for Development \n 3 for Accounting \n 4 for none\n"  + "Enter Department Code ");
        Scanner in = new Scanner (System.in);
        int depChoice = in.nextInt ();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "none";
        }
    }
    // Ask for department generate password

    // Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@";
                char [] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random ()*passwordSet.length ());
            password [i] = passwordSet.charAt (rand);

        }
        return new String (password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set  alternate email id
    public void setAlternateEmail(String altEmail){
        this.alternateEmail =  altEmail;
    }
    // Change the password
    public void changePassword (String password){
        this.password = password;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "Display Name:"+firstName+" "+lastName+"\n" +
                "Company Email:"+email +"\n"+
                "Mailbox Capacity:"+mailboxCapacity+"\tMB\n"+
                "Default Password:"+this.password;



    }
}
