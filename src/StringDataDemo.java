public class StringDataDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample sentence
        String text = "I am learning Java programming";

        // Display the original string
        System.out.println("Original String: " + text);

        // toUpperCase()
        String upper = text.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // toLowerCase()
        String lower = text.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // indexOf()
        System.out.println("Position of 'Java': " + text.indexOf("Java"));

        // substring()
        String part = text.substring(5, 13);
        System.out.println("Substring: " + part);

        // contains()
        System.out.println("Contains 'learning': " + text.contains("learning"));
    }
}