package stringprograms;

// Input a String and print only the alphabet and digit present in the string in the same line
public class Question5 {
    public static void main(String[] args) {
        // The input string
        String word = "This is MAYDAY 123@$$ I repeat MAYDAY 123@$$";

        // Create a StringBuilder to store the filtered characters
        StringBuilder newWord = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a letter or a digit
            if (Character.isLetterOrDigit(ch)) {
                // Append the character to the newWord StringBuilder
                newWord.append(ch);
            }
        }

        // Convert the StringBuilder to a string and print it
        System.out.println(newWord.toString());
    }
}
