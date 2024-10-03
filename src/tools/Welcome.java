package tools;

public class Welcome {
    static String BANK_NAME = "PROFO";
    private String name;
    String salutation = "";
    
    public Welcome(){} // constructor
    
    public void greetUser(){
        System.out.println("=================== HELLO "+getSalutation()+"."+getName()+" ===================");
    }

    public static void introduce_bank(){
        System.out.println("WELCOME TO "+BANK_NAME+" BANK APP THAT MATCHES YOUR STANDARDS ");
        System.out.print("To continue, press: \n\'1\' LOGIN: \n\'2\' NEW ACCOUNT: \n\'X\' EXIT: ");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }   

    
}
