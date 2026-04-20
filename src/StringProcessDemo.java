public class StringProcessDemo {
    public static void main(String[] args) {

        // Create a String with a full employee record (with extra spaces)
        String record = "   Ali,IT,ali@gmail.com   ";

        // Display the original string
        System.out.println("Original Record: '" + record + "'");

        // trim()
        String cleaned = record.trim();

        // Display cleaned string
        System.out.println("Cleaned Record: '" + cleaned + "'");

        // split()
        String[] parts = cleaned.split(",");

        // Display each part
        System.out.println("Split Parts:");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);

        // equalsIgnoreCase()
        String word1 = "java";
        String word2 = "JAVA";
        System.out.println("Are equal (ignore case): " + word1.equalsIgnoreCase(word2));

        // isEmpty()
        String emptyText = "";
        System.out.println("Is empty: " + emptyText.isEmpty());
    }
}