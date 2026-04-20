public class StringOperationsDemo {
    public static void main(String[] args) {

        // Create a String variable with a sample customer name
        String customerName = "Ali";

        // Display the original string
        System.out.println("Original Name: " + customerName);

        // length()
        System.out.println("Length: " + customerName.length());

        // toUpperCase()
        System.out.println("Uppercase: " + customerName.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + customerName.toLowerCase());

        // Create another String variable
        String companyName = "Company";

        // concat()
        String fullInfo = customerName.concat(" " + companyName);

        // Display final combined string
        System.out.println("Combined String: " + fullInfo);
    }
}