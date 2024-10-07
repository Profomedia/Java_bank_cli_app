
import com.google.gson.Gson;

import User.User;
import tools.Capitalize;
import tools.CheckLimits;
import tools.Gender;
import tools.Username;
import tools.Welcome;
import tools.validators.Email;
import tools.validators.Salutation;

import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        String firstName = "";

        // email
        Email email = new Email("mark@gmail.com");

        User user = new User("otieno", "Mark", "Owuor", email.getMail(), 27, Salutation.MR, Gender.MALE,
                "Java developer", 50000, 49020, 8.3, "sdfs365sdf");

        HashMap<Object, User> mains = new HashMap<>();

        mains.put(user.getUsername(), user);
        String json = new Gson().toJson(mains);
        System.out.println(json);
        System.out.println(mains);

        boolean g = true;
        String input;

        String nm = "mark";
        double num = Math.random() * nm.length();
        String converted = num + "";
        System.out.println(converted.substring(2,5));

        Username usn = new Username("Mark");
        System.out.println(usn.generateUser()); 


        // do {
        // Welcome.introduce_bank();
        // Scanner sc = new Scanner(System.in);
        // input = sc.nextLine();

        // switch (input) {
        // case "1":
        // System.out.println("login");
        // System.out.println(user.toString());
        // g = false;
        // break;

        // case "2":
        // System.out.println("new acc");
        // // createAccount(user);
        // System.out.println(createAccount(user));
        // g = false;
        // break;

        // case "x":
        // System.out.println("exit");
        // g = false;
        // System.exit(0);

        // default:
        // System.out.println("no such thing");
        // }
        // } while (g);
    }

    public static User createAccount(User user) {
        String username;
        String firstName;
        String lastName;
        String email;
        Salutation salutation;
        Gender gender;
        String job;
        String password;
        int age;
        double netSalary;
        double grossSalary;
        double tax;

        System.out.println("CREATE ACCOUNT");

        // enter first name
        System.out.print("Enter your first name: ");
        Scanner fN = new Scanner(System.in);
        firstName = fN.nextLine();

        user.setFirstName(Capitalize.capitalize_String(CheckLimits.limits(firstName)));

        // enter last name
        System.out.print("Enter last name: ");
        Scanner fL = new Scanner(System.in);
        lastName = fL.nextLine();
        user.setLastName(Capitalize.capitalize_String(CheckLimits.limits(lastName)));

        // TODO validate email with regex
        // enter email
        System.out.print("Enter email address: ");
        Scanner address = new Scanner(System.in);
        email = address.nextLine();
        user.setEmail(email);

        // enter age
        System.out.println("Enter age: ");
        Scanner inpAge = new Scanner(System.in);
        age = inpAge.nextInt();
        return user;
    }

}
