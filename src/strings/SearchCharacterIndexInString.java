package strings;

import java.util.Scanner;

public class SearchCharacterIndexInString {
    //return the first occurrence of the character in string
    public int searchIndexOfCharacterString(String string, Character ch) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        //initialize SearchCharacterIndexInString
        SearchCharacterIndexInString searchCharacterIndexInString = new SearchCharacterIndexInString();

        System.out.println("Result is below::");
        int indexOfCharacter = searchCharacterIndexInString.searchIndexOfCharacterString(string, ch);

        //Using ternary condition to display result
        System.out.println(
                indexOfCharacter!=-1? ch+" found at "+ indexOfCharacter+ " in "+string: ch+ " is not found in "+string
        );
    }
}
