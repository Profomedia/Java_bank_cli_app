package tools.validators;

import java.util.Scanner;

public class Email {
    Scanner sc = new Scanner(System.in);
    public String mail;
    public Email(String email){
        this.mail = email;
    }

    // get email
    public String getMail(){
        return this.mail;
    }
}