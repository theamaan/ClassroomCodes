package stringworksheet3;
//Input a String and print each word in a separate line along with its length 
public class Question2 {
    public static void main(String[] args) {
        String orgWord = "The is a line";
        String newWord = orgWord + " ";
        int d = 0;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d,i).trim();
                System.out.println("The word is '"+word+"' and it's length is "+word.length());
                d=i;
            }
        }
    }
}
