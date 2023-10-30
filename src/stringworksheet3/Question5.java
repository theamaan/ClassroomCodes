package stringworksheet3;

// Input a String and print only those words which start with 'h' or 'H'.
public class Question5 {
    public static void main(String[] args) {
        String orgWord = "He who has faith has wisdom";
        String newWord = orgWord + " ";
        int d = -1; // Initialize d to -1
        String word = null;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if (Character.isWhitespace(ch)) {
                word = newWord.substring(d+1 , i);
                if (word.charAt(0) == 'h' || word.charAt(0) == 'H') {
                    System.out.println(word);
                }
                d = i;
            }
        }
    }
}
