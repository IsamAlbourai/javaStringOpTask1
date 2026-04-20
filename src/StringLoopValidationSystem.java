import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // display original string
        System.out.println("Original String: " + text);

        // length()
        int length = text.length();
        System.out.println("Length: " + length);

        int vowels = 0;

        // for loop
        for (int i = 0; i < length; i++) {

            // charAt()
            char ch = text.charAt(i);

            // display each character
            System.out.println(ch);

            // count vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }

        // display vowels count
        System.out.println("Total vowels: " + vowels);

        // contains()
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        if (text.contains(word)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }

        // if-else length check
        if (text.length() > 10) {
            System.out.println("String is long");
        } else {
            System.out.println("String is short");
        }

        input.close();
    }
}