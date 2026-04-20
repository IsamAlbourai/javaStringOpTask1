public class StringNestedLoopDemo {
    public static void main(String[] args) {

        // Create two String variables with sample text values
        String text1 = "Java";
        String text2 = "Jama";

        // Display both strings
        System.out.println("Text 1: " + text1);
        System.out.println("Text 2: " + text2);

        // length()
        int length1 = text1.length();
        int length2 = text2.length();

        System.out.println("Length of Text 1: " + length1);
        System.out.println("Length of Text 2: " + length2);

        int matchCount = 0;

        // outer loop
        for (int i = 0; i < length1; i++) {

            // inner loop
            for (int j = 0; j < length2; j++) {

                // charAt() comparison
                if (text1.charAt(i) == text2.charAt(j)) {

                    System.out.println("Matching character: " + text1.charAt(i));
                    matchCount++;
                }
            }
        }

        // display total matches
        System.out.println("Total Matching Characters: " + matchCount);

        // another nested loop example
        String word1 = "cat";
        String word2 = "car";

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);

        int matchCount2 = 0;

        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {

                    System.out.println("Match found: " + word1.charAt(i));
                    matchCount2++;
                }
            }
        }

        System.out.println("Total Matches (second example): " + matchCount2);
    }
}