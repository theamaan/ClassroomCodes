package stringworksheet3;
// Input a String and print each word in a separate line
public class Question1 {
    public static void main(String[] args) {
        String orgWord = "This is a Line";
        String newWord = orgWord + " " ;
        int d = 0;
        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
               String word = newWord.substring(d,i).trim();
               System.out.println(word);
               d=i;
            }
        }
    }
}