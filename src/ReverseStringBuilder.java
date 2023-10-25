public class ReverseStringBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder initialized with the string "akaza"
        StringBuilder stringBuilder = new StringBuilder("akaza");

        // Iterate over the first half of the string
        for (int i = 0; i < stringBuilder.length() / 2; i++) {
            int frontIndex = i; // Index of the character from the front of the string
            int backIndex = stringBuilder.length() - 1 - i; // Index of the character from the back of the string

            char frontChar = stringBuilder.charAt(frontIndex); // Character at the front index
            char backChar = stringBuilder.charAt(backIndex); // Character at the back index

            // Swap the characters
            stringBuilder.setCharAt(frontIndex, backChar);
            stringBuilder.setCharAt(backIndex, frontChar);
        }

        // Print the reversed string
        System.out.println(stringBuilder);
    }
}
