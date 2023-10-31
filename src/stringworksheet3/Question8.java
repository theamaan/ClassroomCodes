package stringworksheet3;
//Input a String and print only those words which start with consonants
public class Question8 {
    public static void main(String[] args) {
        String orgWord = "Do unto others as you would have them to do unto you.";
        String newWord = orgWord + " ";
        int d = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                if(word.charAt(0)!='a'&& word.charAt(0)!='e' && word.charAt(0)!='i'&& word.charAt(0)!='o'&& word.charAt(0)!='u'){
                    System.out.println(word);
                }
                d=i;
            }
        }
    }
}
