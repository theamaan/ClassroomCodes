package stringworksheet3;
//Input a String and print only those words that contains a vowel
public class Question15 {
    public static void main(String[] args) {
        String orgWord = " Play the tune in rhythm by the sea";
        String newWord = orgWord + " "; // Append a space to the end for proper word extraction.
        int d = -1; // Initialize the word boundary marker.
        boolean flag = false; // Initialize a flag to track if a word with vowels is found.

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);

            if (Character.isWhitespace(ch)) { // Check if the current character is a space (word separator).
                String word = newWord.substring(d + 1, i); // Extract the word between spaces.

                for (int j = 0; j < word.length(); j++) {
                    char character = word.charAt(j);

                    // Check if the character is a vowel (both lowercase and uppercase).
                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                            character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                        System.out.print(word + " "); // Print the word if it contains a vowel.
                        flag = true; // Set the flag to true to indicate a word with vowels was found.
                        break; // Exit the loop once a vowel is found in the word.
                    }
                }

                d = i; // Update the word boundary marker for the next word.
            }
        }
    }
}

