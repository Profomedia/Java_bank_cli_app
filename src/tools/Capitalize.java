package tools;

public class Capitalize {
    // capitalize string
    public static String capitalize_String(String s){
        // extract the first letter and convert to uppercase
        String firstLetter = s.substring(0,1).toUpperCase();

        // slice the first char of the string
        String stringNoHead = s.substring(1, s.length());

        return (firstLetter+stringNoHead);
    }
}
