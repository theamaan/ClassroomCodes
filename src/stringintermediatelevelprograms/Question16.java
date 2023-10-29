package stringintermediatelevelprograms;
//input a name and print it like:- Amaan Ullah Ansari :- A.U.A.
public class Question16 {
    public static void main(String[] args) {
        String orgWord = "Amaan Ullah Ansari";
        String newWord = " " + orgWord;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                char character = newWord.charAt(i+1);
                System.out.print(character+".");
            }
        }
    }
}
