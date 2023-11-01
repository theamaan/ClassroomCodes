package stringworksheet4;

import java.util.Scanner;

//Input a String and print it in alphabetical order
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input string to lowercase for case-insensitive sorting
        input = input.toLowerCase();

        // Sort the string using ASCII values
        String sortedString = sortStringAlphabetically(input);

        System.out.println("String in alphabetical order: " + sortedString);
    }

    public static String sortStringAlphabetically(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    // Swap the characters if they are out of order
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        return new String(charArray);
    }
}