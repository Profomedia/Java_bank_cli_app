
import com.google.gson.Gson;

import User.User;
import tools.Gender;
import tools.Welcome;
import tools.validators.Email;
import tools.validators.Salutation;

import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        // email
        Email email = new Email("mark@gmail.com");

        User user = new User("omark", "Mark", "Owuor", email.getMail(), 27, Salutation.MR, Gender.MALE, "Java developer", 50000, 49020, 8.3, "sdfs365sdf");

        HashMap<Object, User> user1= new HashMap<>();
        user1.put(user.getUsername(), user);
        String json = new Gson().toJson(user1);
        System.out.println(json);


        boolean g = true;
        String input;
        do{
            Welcome.introduce_bank();
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("login");
                    System.out.println(user.toString());
                    g=false;
                    break;
            
                case "2":
                    System.out.println("new acc");
                    break;
            
                case "x":
                    System.out.println("exit");
                    g=false;
                    System.exit(0);
            
                default:
                    System.out.println("no such thing");
            }
        }while(g);
    }
}



// // TODO    add this line in setings.json
// "editor.tokenColorCustomizations": {
//     "comments": "#69bba0"
//     },