public class StringLoopDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample sentence
        String text = "I love Java 123";

        // Display the original string
        System.out.println("Original String: " + text);

        // length()
        int length = text.length();
        System.out.println("Length: " + length);

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        // for loop
        for (int i = 0; i < length; i++) {

            // charAt()
            char ch = text.charAt(i);

            // Display each character
            System.out.println(ch);

            // check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            // check digits
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // check consonants (letters only)
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
        }

        // Display results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}