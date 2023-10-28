package stringintermediatelevelprograms;
//Input a String and Convert abba to fggf
public class Question2 {
    public static void main(String[] args) {
        // Input string
        String originalWord = "abba";

        // Iterate through each character in the input string
        for (int i = 0; i < originalWord.length(); i++) {
            // Retrieve the character
            char ch = originalWord.charAt(i);

            // Perform the conversion by adding 5 to the ASCII value
            int m = (int) ch + 5;

            // Print the converted character
            System.out.print((char) m);
        }
    }
}
