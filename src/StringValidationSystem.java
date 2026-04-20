import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // display original string
        System.out.println("Original String: " + text);

        // length()
        System.out.println("Length: " + text.length());

        // uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // contains()
        System.out.print("Enter word to search: ");
        String searchWord = input.nextLine();

        if (text.contains(searchWord)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }

        // equalsIgnoreCase()
        System.out.print("Enter another string to compare: ");
        String text2 = input.nextLine();

        if (text.equalsIgnoreCase(text2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // substring()
        if (text.length() >= 5) {
            System.out.println("Substring (0,5): " + text.substring(0, 5));
        } else {
            System.out.println("String too short for substring");
        }

        // if-else length check
        if (text.length() > 5) {
            System.out.println("String length is greater than 5");
        } else {
            System.out.println("String length is 5 or less");
        }

        input.close();
    }
}