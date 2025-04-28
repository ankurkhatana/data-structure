import strings.CompareStrings;
import strings.LengthOfString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("start of the main method");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string");
        String string1 = scanner.nextLine();

        System.out.println("Enter second string");
        String string2 = scanner.nextLine();


        //initialize CompareStrings
        CompareStrings compare = new CompareStrings();

        //call compareTwoStrings()

        System.out.println(compare.compareTwoStrings(string1, string2)?"string1: " + string1 + " and string2: " + string2 + " are equal":
                "string1: " + string1 + " and string2: " + string2 + " are not equal");

        scanner.close();
        System.out.println("end of the main method");
    }
}