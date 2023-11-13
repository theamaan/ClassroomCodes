package codingbot;

public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }
    public static String getSandwich(String str) {
        // Find the index of the first occurrence of "bread" in the string
        int firstOccurrenceIndex = str.indexOf("bread");

        // Find the index of the last occurrence of "bread" in the string
        int lastOccurrenceIndex = str.lastIndexOf("bread");

        // Check if both occurrences are valid and if the first occurrence comes before the last
        if (firstOccurrenceIndex != -1 && lastOccurrenceIndex != -1 && firstOccurrenceIndex < lastOccurrenceIndex) {
            // Extract the filling between the two bread occurrences
            return str.substring(firstOccurrenceIndex + 5, lastOccurrenceIndex);
        }

        // Return an empty string if no valid sandwich is found
        return "";
    }

}
//    In the given example, the input string is "xxbreadjambreadyy." The goal is to extract the filling, which is "jam" in this case, as it's between the two occurrences of the word "bread."
//
//        firstOccurrenceIndex != -1: This condition ensures that the word "bread" is found in the string. If it's not found (-1), the code inside the block won't execute.
//
//        lastOccurrenceIndex != -1: This condition checks if there is at least one more occurrence of the word "bread" in the string. Again, if it's not found, the code won't execute.
//
//        firstOccurrenceIndex < lastOccurrenceIndex: This ensures that the first occurrence of "bread" comes before the last occurrence. It's a way to make sure that there is a valid sandwich structure with something in between the two occurrences.