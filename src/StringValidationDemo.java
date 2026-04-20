public class StringValidationDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample text value
        String text = "student@gmail.com";

        // Display the original string
        System.out.println("Original String: " + text);

        // startsWith()
        System.out.println("Starts with 'student': " + text.startsWith("student"));

        // endsWith()
        System.out.println("Ends with '.com': " + text.endsWith(".com"));

        // replace()
        String updated = text.replace("student", "user");
        System.out.println("Updated String: " + updated);

        // substring()
        String part = text.substring(0, text.indexOf("@"));
        System.out.println("Extracted Text: " + part);

        // length()
        System.out.println("Length: " + text.length());
    }
}