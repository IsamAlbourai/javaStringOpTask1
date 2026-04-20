public class StringAnalysisDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample text
        String text1 = "Java Programming";

        // Display the original string
        System.out.println("Original Text: " + text1);

        // length()
        System.out.println("Length: " + text1.length());

        // Create another String variable
        String text2 = "Java Programming";

        // equals()
        System.out.println("Are texts equal: " + text1.equals(text2));

        // indexOf()
        System.out.println("Position of 'Pro': " + text1.indexOf("Pro"));

        // startsWith()
        System.out.println("Starts with 'Java': " + text1.startsWith("Java"));

        // endsWith()
        System.out.println("Ends with 'ing': " + text1.endsWith("ing"));
    }
}
