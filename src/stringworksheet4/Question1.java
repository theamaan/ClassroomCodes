package stringworksheet4;

import java.util.Scanner;

// Input a String and print the frequency of the character of each String
// Input :- This is
// Output :
//The Frequency of H is 1
//The Frequency of I is 2
//The Frequency of I is 2
//The Frequency of S is 1
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Loop through lowercase letters from 'a' to 'z' to count their frequencies
        for (char character = 'a'; character <= 'z'; character++) {
            int frequency = countCharacterFrequency(inputString, character);

            // Print the frequency of the current character
            if (frequency > 0) {
                System.out.println("The Frequency of " + character + " is " + frequency);
            }
        }
    }

    // Function to count the frequency of a specific character in a given string
    public static int countCharacterFrequency(String input, char targetCharacter) {
        input = input.toLowerCase(); // Convert input to lowercase
        int count = 0; // Initialize count to 0

        // Iterate through the characters in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);

            // Check if the current character matches the target character
            if (currentCharacter == targetCharacter) {
                count++; // Increment count if there is a match
            }
        }

        return count; // Return the final count of the target character in the input string
    }
}
