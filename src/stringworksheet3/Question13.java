package stringworksheet3;
// Input a String and print reverse of each word
public class Question13 {
    public static void main(String[] args) {
        // Define the input String
        String originalString = "He who has faith has wisdom";

        // Append a space to the input String for easy word extraction
        String stringWithSpace = originalString + " ";
        int previousSpaceIndex = -1;

        for (int i = 0; i < stringWithSpace.length(); i++) {
            char character = stringWithSpace.charAt(i);

            // Check if the character is a white space
            if (Character.isWhitespace(character)) {
                // Extract the word between the previous space and the current position
                String word = stringWithSpace.substring(previousSpaceIndex + 1, i);

                // Reverse and print the word
                String reversedWord = reverseString(word);
                System.out.print(reversedWord + " ");

                // Update the previous space index
                previousSpaceIndex = i;
            }
        }
    }

    // Function to reverse a given string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
