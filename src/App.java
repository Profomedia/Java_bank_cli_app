
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import User.User;
import tools.Capitalize;
import tools.CheckLimits;
import tools.Gender;
import tools.Username;
import tools.Welcome;
import tools.filehandler.File_manager;
import tools.filehandler.Json_Handler;
import tools.validators.AgeValidator;
import tools.validators.Email;
import tools.validators.Salutation;

import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        boolean g = true;
        String input;

        do {
            Welcome.introduce_bank();
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("login");
                    g = false;
                    break;

                case "2":
                    System.out.println("new acc");
                    // createAccount(user);
                    createAccount();
                    g = false;
                    break;

                case "x":
                    System.out.println("exit");
                    g = false;
                    System.exit(0);

                default:
                    System.out.println("no such thing");
            }
        } while (g);
    }

    public static void createAccount() {
        String firstName = "";
        String lastName = "";
        String email = "";
        Salutation salutation = Salutation.NONE;
        Gender gender = Gender.NONE;
        String job = "";
        String password = "";
        int age=0;
        double netSalary=0;
        double grossSalary=0;
        double tax=0;

        
        System.out.println("CREATE ACCOUNT");
        
        // enter first name
        System.out.print("Please enter your first name: ");
        Scanner fN = new Scanner(System.in);
        firstName = fN.nextLine();

        
        //create user object
        User user = new User(firstName, "", "", age, Salutation.MR, Gender.MALE, "job", 0, 0, 0,""); 

        user.setFirstName(Capitalize.capitalize_String(CheckLimits.limits(firstName)));

        user.setUsername(user.getFirstName());
        System.out.println(user.getFirstName()+"line");
        
        // enter last name
        System.out.print("Enter last name: ");
        Scanner fL = new Scanner(System.in);
        lastName = fL.nextLine();
        user.setLastName(Capitalize.capitalize_String(CheckLimits.limits(lastName)));
        

        // TODO validate email with regex
        // enter email
        // System.out.print("Enter email address: ");
        // Scanner address = new Scanner(System.in);
        // email = address.nextLine();
        // user.setEmail(email);

        // enter age
        System.out.print("Enter age: ");
        
        while (age <= 0){
            try{
                Scanner inpAge = new Scanner(System.in);
                age = inpAge.nextInt();
            }catch (InputMismatchException e){
                System.out.print("wrong input: ");
            }
        }
        
        user.setAge(AgeValidator.validate(age));
    

        // ===============================================
        // email
        // Email email = new Email("mark@gmail.com");

        // create an array and add the user then convert to json
        ArrayList<User> userArray = new ArrayList<>();
        userArray.add(user);

        // handle json data
        Json_Handler.jsonHandle(userArray, user);
        // ===============================================
        System.out.println(userArray);
    }

  
}
