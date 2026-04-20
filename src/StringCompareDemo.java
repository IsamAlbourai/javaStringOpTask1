public class StringCompareDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample word
        String word1 = "Java";

        // Display the original string
        System.out.println("Original Word: " + word1);

        // charAt()
        System.out.println("Character at index 1: " + word1.charAt(1));

        // substring()
        System.out.println("Substring (0,2): " + word1.substring(0, 2));

        // Create another String variable
        String word2 = "Java";

        // equals()
        System.out.println("Are words equal: " + word1.equals(word2));

        // Compare two different strings
        String word3 = "Python";
        System.out.println("Compare with different word: " + word1.equals(word3));
    }
}