package stringworksheet3;
//Input a String and print only those words which end with r
public class Question9 {
    public static void main(String[] args) {
        String orgWord = "Conquer anger by love conquer evil by good";
        String newWord = orgWord + " ";
        int d = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                if(word.charAt(word.length()-1)=='r'){
                    System.out.println(word);
                }
                d = i;
            }
        }
    }
}
