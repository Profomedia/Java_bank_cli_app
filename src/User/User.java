package User;
import java.util.UUID;

import tools.Gender;
import tools.validators.*;

public class User{
    UUID ID = UUID.randomUUID();
    String username;
    String  firstName;
    String  lastName;
    String email;
    int age;
    Salutation salutation;
    Gender gender;
    String job;
    double netSalary;
    double grossSalary;
    double tax;
    String password;

    // constructor
    public User(String username, String firstName, String lastName,String email, int age, Salutation salutation,Gender gender, String job, double netSalary, double grossSalary, double tax, String password) {
        this.ID = getID();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salutation = salutation;
        this.gender = gender;
        
        this.job = job;
        this.netSalary = netSalary;
        this.grossSalary = grossSalary;
        this.tax = tax;
        this.password = password;
    }

    // get ID
    public UUID getID(){
        return ID;
    }

    // get username
    public String getUsername(){
        return this.username;
    }

    // set username
    public void setUsername(String username){
        //TODO refine this line more like auto suggesting a username
        this.username = username; 
    }

    // get firstname
    public String getFirstName(){
        return this.firstName;
    }

    // set firstname
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    // get last name
    public String getLastName(){
        return this.lastName;
    }

    // set last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    
    // get age
    public int getAge(){
        return this.age;
    }

    // get email
    public String getEmail(){
        return this.email;
    }

    // set email
    public void setEmail(String email){
        this.email = email;
    }
    // set age
    public void setAge(int age){
        this.age = age;
    }

    // get salutation
    public Salutation getSalutation(){
        return this.salutation;
    }

    // set salutation
    public void setSalutation(Salutation salutation){
        this.salutation = salutation;
    }

    // get gender
    public Gender getGender(){
        return this.gender;
    }

    // set gender
    public void setGender(Gender gender){
        this.gender = gender;
    }

    // get job
    public String getJob(){
        return this.job;
    }

    // set job
    public void setJob(String job){
        this.job = job;
    }

    // net sal
    public double getNetSalary(){
        return netSalary;
    }

    // set net salary 
    public void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }

    // net gross salary 
    public double getGrossSalary(){
        return grossSalary;
    }

    // set gross salary
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    // get tax
    public double getTax(){
        return netSalary;
    }

    // set tax
    public void setTax(double tax){
        this.tax = tax;
    }

    // get password
    public String getPassword(){
        return password;
    }

    // set password
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [ID=" + ID + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", age=" + age + ", salutation=" + salutation + ", gender=" + gender + ", job="
                + job + ", netSalary=" + netSalary + ", grossSalary=" + grossSalary + ", tax=" + tax + ", password="
                + password + "]";
    }

    
}
