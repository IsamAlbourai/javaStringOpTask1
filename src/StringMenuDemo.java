import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // display menu
        System.out.println("\n--- STRING MENU ---");
        System.out.println("1. Length of string");
        System.out.println("2. Uppercase");
        System.out.println("3. Lowercase");
        System.out.println("4. Contains word");
        System.out.println("5. Compare strings");

        // user choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        // switch statement
        switch (choice) {

            case 1:
                System.out.println("Length: " + text.length());
                break;

            case 2:
                System.out.println("Uppercase: " + text.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase: " + text.toLowerCase());
                break;

            case 4:
                System.out.print("Enter word to search: ");
                String word = input.nextLine();

                if (text.contains(word)) {
                    System.out.println("Word found");
                } else {
                    System.out.println("Word not found");
                }
                break;

            case 5:
                System.out.print("Enter another string: ");
                String text2 = input.nextLine();

                if (text.equalsIgnoreCase(text2)) {
                    System.out.println("Strings are equal");
                } else {
                    System.out.println("Strings are not equal");
                }
                break;

            default:
                System.out.println("Invalid menu choice");
                break;
        }

        input.close();
    }
}