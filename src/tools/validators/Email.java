package tools.validators;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    // get email
    public static String validate(String email) {
        // regex
        // [a-zA-Z0-9_.+-]+[a-zA-Z0-9-]+\.[a-zA-Z0-9-]
        // Pattern pattern = Pattern.compile("^\\w+[^.-]@[gmail|yahoo]+\\.com");
        
        boolean matchNotFound = true;
        
        do {
            Scanner inputEmail = new Scanner(System.in);
            System.out.print("invalid email! please try again: ");
            email = inputEmail.nextLine();

            // the min chars before @gmail|yahoo.com is 2
            Pattern pattern = Pattern.compile("^\\w+[^.-]\\b{2,}\\b@[gmail|yahoo]+\\.com");
            Matcher matcher = pattern.matcher(email);
            boolean matchFound = matcher.find();
            
            if (matchFound) matchNotFound = false;           

        } while (matchNotFound);

        return email;
    }
}