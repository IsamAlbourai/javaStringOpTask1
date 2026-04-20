public class StringDoWhileDemo {
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

        int lowerCase = 0;
        int spaces = 0;

        // do-while loop
        do {

            // charAt()
            char ch = text.charAt(i);

            // display each character
            System.out.println(ch);

            // count lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                lowerCase++;
            }

            // count spaces
            if (ch == ' ') {
                spaces++;
            }

            // increase counter
            i++;

        } while (i < length);

        // display results
        System.out.println("Lowercase Letters: " + lowerCase);
        System.out.println("Spaces: " + spaces);
    }
}