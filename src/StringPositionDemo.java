public class StringPositionDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample text
        String text = "student@gmail.com";

        // Display the original string
        System.out.println("Original String: " + text);

        // indexOf()
        System.out.println("Position of '@': " + text.indexOf("@"));

        // startsWith()
        System.out.println("Starts with 'student': " + text.startsWith("student"));

        // endsWith()
        System.out.println("Ends with '.com': " + text.endsWith(".com"));
    }
}