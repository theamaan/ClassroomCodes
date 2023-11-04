package stringworksheet4;
/* A message is to be conveyed by adding 10 to the total ASCII code of characters in the statement given below
Write a program to print the following statements into coded message.
 */
public class Question7 {
    public static void main(String[] args) {
        String orgWord = "YOKO HAS SMILED";
        int sum = 0;
        char ch;

        for (int i = 0; i < orgWord.length(); i++) {
            ch = orgWord.charAt(i);
            int encodedChar = (int)ch + 10; // Adding 10 to the ASCII code
            sum += encodedChar;
            System.out.print(encodedChar + " "); // Print the encoded character
        }

        System.out.println(); // To add a new line after printing the encoded characters
        System.out.println("Total sum: " + sum);
    }
}