public class StringModifyDemo {
    public static void main(String[] args) {

        // Create a String with extra spaces
        String sentence = "   I like Java programming   ";

        // Display the original string
        System.out.println("Original String: '" + sentence + "'");

        // trim()
        String trimmed = sentence.trim();

        // Display trimmed string
        System.out.println("Trimmed String: '" + trimmed + "'");

        // contains()
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // replace()
        String updated = trimmed.replace("Java", "Python");

        // Display updated string
        System.out.println("Updated String: " + updated);
    }
}