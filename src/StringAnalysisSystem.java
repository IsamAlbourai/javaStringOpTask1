import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // display original string
        System.out.println("Original String: " + text);

        // length()
        System.out.println("Length: " + text.length());

        // contains()
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        if (text.contains(word)) {
            System.out.println("Word found in string");
        } else {
            System.out.println("Word not found in string");
        }

        // equalsIgnoreCase()
        System.out.print("Enter another string to compare: ");
        String text2 = input.nextLine();

        if (text.equalsIgnoreCase(text2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // charAt()
        System.out.println("First character: " + text.charAt(0));

        // if-else length check
        if (text.length() > 10) {
            System.out.println("String is long");
        } else {
            System.out.println("String is short");
        }

        input.close();
    }
}