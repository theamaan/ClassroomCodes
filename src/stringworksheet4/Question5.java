package stringworksheet4;
/* Write a program to accept a String and convert it to uppercase. Count and output number of double letter
sequences that exist in the string.
Input :- "She was feeding the little rabbit with an apple"
Output :- 4

 */
public class Question5 {
    public static void main(String[] args) {
        String orgWord = "She was feeding the little rabbit with an apple";
        int countIs = doubleLetterSequence(orgWord);
        System.out.println("Output is "+countIs);
    }
    public static int doubleLetterSequence(String word){
        int count = 0;

        for (int i = 0; i < word.length()-1; i++) {
            char currentChar = word.charAt(i);
            char nextChar = word.charAt(i + 1);

            if (Character.isLetter(currentChar) && Character.isLetter(nextChar) && currentChar == nextChar) {
                count++;
            }
        }

        return count;
    }
}
