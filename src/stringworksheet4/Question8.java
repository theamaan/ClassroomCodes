package stringworksheet4;
/*
Input 3 strings, say A,B,C. In String A, Search for String B and replace all the occurrences of B by C
Example:-
A= The brown fox jumps over the wall
B= The
C= Tall
Output:- Tall brown fox jumps over tall wall
 */
public class Question8 {
    public static void main(String[] args) {
        // Input strings A, B, and C
        String a = "The brown fox jumps over the wall"; // Original string
        String b = "The"; // String to search for
        String c = "Tall"; // Replacement string

        // Call the modifiedWord function to replace occurrences of B with C
        String result = modifiedWord(a, b, c);

        // Print the modified string
        System.out.println(result);
    }

    // Function to replace occurrences of B with C in A
    public static String modifiedWord(String a, String b, String c) {
        // Replace all occurrences of B with C in A
        String modifiedString = a.replace(b, c);

        // Return the modified string
        return modifiedString;
    }
}