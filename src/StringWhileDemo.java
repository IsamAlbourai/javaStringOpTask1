public class StringWhileDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample sentence
        String text = "I Love Java Programming";

        // Display the original string
        System.out.println("Original String: " + text);

        // length()
        int length = text.length();
        System.out.println("Length: " + length);

        // loop counter
        int i = 0;

        int spaces = 0;
        int upperCase = 0;

        // while loop
        while (i < length) {

            // charAt()
            char ch = text.charAt(i);

            // display each character
            System.out.println(ch);

            // count spaces
            if (ch == ' ') {
                spaces++;
            }

            // count uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                upperCase++;
            }

            // increase counter
            i++;
        }

        // display results
        System.out.println("Spaces: " + spaces);
        System.out.println("Uppercase Letters: " + upperCase);
    }
}
