import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // display original string
        System.out.println("Original String: " + text);

        // contains()
        System.out.print("Enter word to search: ");
        String searchWord = input.nextLine();

        if (text.contains(searchWord)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }

        // replace()
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        String modified = text.replace(oldWord, newWord);

        System.out.println("Modified String: " + modified);

        // substring()
        if (modified.length() >= 5) {
            System.out.println("Substring (0,5): " + modified.substring(0, 5));
        } else {
            System.out.println("String too short for substring");
        }

        // charAt()
        if (modified.length() > 0) {
            System.out.println("Character at index 0: " + modified.charAt(0));
        }

        // if-else length check
        if (modified.length() > 8) {
            System.out.println("Modified string has more than 8 characters");
        } else {
            System.out.println("Modified string has 8 or fewer characters");
        }

        input.close();
    }
}