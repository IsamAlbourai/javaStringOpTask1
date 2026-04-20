public class StringReverseDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample word or sentence
        String text = "Java Programming";

        // Display the original string
        System.out.println("Original String: " + text);

        // length()
        int length = text.length();
        System.out.println("Length: " + length);

        // forward loop
        System.out.println("Forward Characters:");
        for (int i = 0; i < length; i++) {
            System.out.println(text.charAt(i));
        }

        // reverse loop
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // display reversed string
        System.out.println("Reversed String: " + reversed);

        // count specific character
        char checkChar = 'a';
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == checkChar) {
                count++;
            }
        }

        // display count
        System.out.println("Character '" + checkChar + "' appears: " + count);

        // visual comparison
        System.out.println("Original vs Reversed:");
        System.out.println(text);
        System.out.println(reversed);
    }
}