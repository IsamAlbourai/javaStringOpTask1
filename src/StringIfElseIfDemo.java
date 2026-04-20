public class StringIfElseIfDemo {
    public static void main(String[] args) {

        // sample text value
        String text = "Java";

        // display original string
        System.out.println("Original String: " + text);

        // empty check
        if (text.isEmpty()) {
            System.out.println("String is empty");

            // length check
        } else if (text.length() < 5) {
            System.out.println("String is short");

            // startsWith check
        } else if (text.startsWith("J")) {
            System.out.println("String starts with J");

            // endsWith check
        } else if (text.endsWith("a")) {
            System.out.println("String ends with a");

            // equalsIgnoreCase check
        } else if (text.equalsIgnoreCase("Java")) {
            System.out.println("String equals Java (ignore case)");

        } else {
            System.out.println("No condition matched");
        }
    }
}