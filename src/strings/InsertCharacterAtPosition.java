package strings;

public class InsertCharacterAtPosition {

    public String insertCharacterAtPositionInString(String string, String ch, int position) {
        StringBuilder result = new StringBuilder();
        if (position > string.length()) {
            result.append(ch);
        }
        for(int i = 0; i < string.length(); i++) {
            if (i == position) {
                result.append(ch);
            }
            result.append(string.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        InsertCharacterAtPosition insertCharacterAtPosition = new InsertCharacterAtPosition();
        String resultString = insertCharacterAtPosition.insertCharacterAtPositionInString("HelloWorld", "!", 5);
        System.out.println(resultString);
    }
}
