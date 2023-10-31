package stringworksheet3;
//Input a String and print only those words which ends with p
public class Question10 {
    public static void main(String[] args) {
        String orgWord = "To keep the lamp burning we have to keep putting oil in it.";
        String newWord = orgWord + " ";
        int d = -1;

        for (int i = 0; i < newWord.length(); i++) {
            char ch = newWord.charAt(i);
            if(Character.isWhitespace(ch)){
                String word = newWord.substring(d+1,i);
                if(word.charAt(word.length()-1)=='p'){
                    System.out.println(word);
                }
                d = i;
            }
        }
    }
}
