package tools;

import java.util.Scanner;

public class CheckLimits {
    @SuppressWarnings("resource")
    public static String limits(String value) {
        Scanner scanner = new Scanner(System.in);
        while (value.isEmpty()) {
            System.out.print("Input cannot be empty: ");
            value = scanner.nextLine().trim();
        }
        return value;
    }
}
