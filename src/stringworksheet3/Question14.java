package stringworksheet3;

public class Question14 {
    public static void main(String[] args) {
        // Define the input String
        String originalString = "Stay Steadfast and Unwavering";

        // Append a space to the input String for proper word extraction
        String stringWithSpace = " " + originalString + " ";
        int end = stringWithSpace.length(); // Initialize 'end' to the end of the string

        for (int i = stringWithSpace.length() - 1; i >= 0; i--) {
            char character = stringWithSpace.charAt(i);

            // Check if the character is a white space
            if (Character.isWhitespace(character)) {
                // Extract the word between the current position and 'end'
                String word = stringWithSpace.substring(i + 1, end).trim();
                if (!word.isEmpty()) {
                    System.out.print(word + " ");
                }
                end = i; // Update 'end' to the current position
            }
        }
    }
}
