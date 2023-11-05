package codingbot;
//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
// https://codingbat.com/prob/p110141
public class DeFront {
    public static String deFront(String str) {
         // Check if the length of the input string is less than 2
        if (str.length() < 2) {
            // If the string is shorter than 2 characters, return it as is
            return str;
        }

        // Initialize an empty string to store the result
        String result = "";

        // Check if the first character of the input string is 'a'
        if (str.charAt(0) == 'a') {
            // If it is 'a', add 'a' to the result string
            result += 'a';
        }

        // Check if the second character of the input string is 'b'
        if (str.charAt(1) == 'b') {
            // If it is 'b', add 'b' to the result string
            result += 'b';
        }

        // Add the remaining characters in the input string, starting from the third character
        result += str.substring(2);

        // Return the result as a modified string
        return result;
    }
    public static void main(String[] args) {
        // Test the deFront method with example strings
        String result1 = deFront("Hello");
        String result2 = deFront("java");
        String result3 = deFront("away");

        // Print the results
        System.out.println("Result 1: " + result1); // "llo"
        System.out.println("Result 2: " + result2); // "va"
        System.out.println("Result 3: " + result3); // "aay"
    }
}
