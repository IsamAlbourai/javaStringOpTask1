public class StringRecordDemo {
    public static void main(String[] args) {

        // Create a String with extra spaces
        String record = "   Ali,IT,ali@gmail.com   ";

        // Display the original string
        System.out.println("Original Record: '" + record + "'");

        // trim()
        String cleaned = record.trim();

        // Display cleaned string
        System.out.println("Cleaned Record: '" + cleaned + "'");

        // equalsIgnoreCase()
        String word1 = "Java";
        String word2 = "java";
        System.out.println("Are equal (ignore case): " + word1.equalsIgnoreCase(word2));

        // split()
        String[] parts = cleaned.split(",");

        // Display each part
        System.out.println("Split Parts:");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);

        // isEmpty()
        String emptyText = "";
        System.out.println("Is empty: " + emptyText.isEmpty());

        // charAt()
        System.out.println("Character at index 1: " + cleaned.charAt(1));
    }
}