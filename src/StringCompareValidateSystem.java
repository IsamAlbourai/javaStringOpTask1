import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // display original string
        System.out.println("Original String: " + text);

        // length()
        System.out.println("Length: " + text.length());

        // equals()
        System.out.print("Enter another string to compare: ");
        String text2 = input.nextLine();

        if (text.equals(text2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // startsWith()
        System.out.print("Enter a prefix: ");
        String prefix = input.nextLine();

        if (text.startsWith(prefix)) {
            System.out.println("String starts with prefix");
        } else {
            System.out.println("String does not start with prefix");
        }

        // endsWith()
        System.out.print("Enter a suffix: ");
        String suffix = input.nextLine();

        if (text.endsWith(suffix)) {
            System.out.println("String ends with suffix");
        } else {
            System.out.println("String does not end with suffix");
        }

        // if-else length check
        if (text.length() > 8) {
            System.out.println("String length is greater than 8");
        } else {
            System.out.println("String length is 8 or less");
        }

        input.close();
    }
}