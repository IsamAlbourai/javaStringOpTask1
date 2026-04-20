public class StringCheckDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample message
        String message = "I love Java programming";

        // Display the original string
        System.out.println("Original Message: " + message);

        // substring()
        String part = message.substring(2, 6);
        System.out.println("Extracted Text: " + part);

        // replace()
        String updated = message.replace("Java", "Python");
        System.out.println("Updated Message: " + updated);

        // contains()
        System.out.println("Contains 'Java': " + message.contains("Java"));

        // charAt()
        System.out.println("Character at index 3: " + message.charAt(3));

        // Create another String variable
        String text2 = "Hello World";

        // Another String operation (toUpperCase)
        String upper = text2.toUpperCase();

        // Display final result
        System.out.println("Second Text Uppercase: " + upper);
    }
}