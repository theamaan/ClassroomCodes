package stringintermediatelevelprograms;
// Amaan Ullah Ansari :- A.U.Ansari
public class Question18 {
    public static void main(String[] args) {
        String orgWord = "Amaan Ullah Ansari";
        String newWord = " "+orgWord;
        int lastIndex = newWord.lastIndexOf(" ");
        String c = null;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                int m = i+1;
                c = (newWord.charAt(m)+".");
                System.out.print(c);
            }
        }
        String word = newWord.substring(lastIndex+1);
        System.out.print(word);
    }
}