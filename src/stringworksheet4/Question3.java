package stringworksheet4;

/**
 * Pig Latin Translator: This program translates a word into Pig Latin.
 * To do this, it converts the word to uppercase, places the first vowel of
 * the original word at the start of the new word along with the remaining
 * alphabets, and adds the previous elements at the end followed by "AY".
 */
public class Question3 {
    public static void main(String[] args) {
        // Original word to be translated to Pig Latin
        String originalWord = "London";

        // Convert the original word to uppercase
        String uppercaseWord = originalWord.toUpperCase();

        // Initialize the index of the first vowel
        int firstVowelIndex = 0;

        // Find the index of the first vowel in the uppercase word
        for (int i = 0; i < uppercaseWord.length(); i++) {
            char currentChar = uppercaseWord.charAt(i);
            if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                firstVowelIndex = i;
                break;
            }
        }

        // Create Pig Latin components
        String firstPart = uppercaseWord.substring(firstVowelIndex);
        String secondPart = uppercaseWord.substring(0, firstVowelIndex);
        String pigLatinWord = firstPart + secondPart + "AY";

        // Print the Pig Latin translation
        System.out.println(pigLatinWord);
    }
}
