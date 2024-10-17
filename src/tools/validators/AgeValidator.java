package tools.validators;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AgeValidator {
    int age;

    public AgeValidator(int age){
        this.age = age;
    }

    
    public static int validate(int age) {
        int MAX_AGE = 45;
        int MIN_AGE = 18;

    
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                    if (age > 45) {
                        System.out.print("max age is " + MAX_AGE + " please try again: ");
                        age = scanner.nextInt();
                    }
    
                    else if (age < 18) {
                        System.out.print("min age is " + MIN_AGE + " please try again: ");
                        age = scanner.nextInt();
                    }
                } catch(NoSuchElementException e){
                    System.out.println("Age gap should be between 18 - 45: ");
                }
        } while (age > 45 || age < 18);
                

        return age;
    }
}
