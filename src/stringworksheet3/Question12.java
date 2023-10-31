package stringworksheet3;
// Input a String and print only those words which ends with consonant
public class Question12 {
    public static void main(String[] args) {
        String orgWord = "The man without faith is a walking corpse.";
        String newWord = orgWord + " ";
        int m = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = orgWord.substring(m+1,i);
                if(word.charAt(word.length()-1)!='a'&& word.charAt(word.length()-1)!='e' && word.charAt(word.length()-1)!='i'&& word.charAt(word.length()-1)!='o'&& word.charAt(word.length()-1)!='u'){
                    System.out.println(word);
                }
                m=i;
            }
        }
    }
}
